package domain.game;

import domain.settings.Settings;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GamePeriods extends Thread{
    private final Game game;
    private final long PERIOD_DURATION = Settings.get().getPeriodDuration();
    private final Boolean STOP_ON_TIMEOUT = Settings.get().getStopOnTimeout();
    private final int GAME_DURATION = Settings.get().getGamePeriod();

    public GamePeriods(Game game) {
        this.game = game;
    }
    @Override
    public void run() {
        game.showStatistics();
        ScheduledExecutorService gameScheduledThreadPool= Executors.newScheduledThreadPool(8);
        gameScheduledThreadPool.scheduleWithFixedDelay(this::runAndWaitCreatureRunners, PERIOD_DURATION, GAME_DURATION, TimeUnit.MILLISECONDS);

        if (Boolean.TRUE.equals(STOP_ON_TIMEOUT)) runTimer();
    }

    private void runAndWaitCreatureRunners() {
        ArrayList<CreatureRunner> creatureRunners = new ArrayList<>();
        for (String creatureType : Settings.get().getCreatureTypes()) {
            creatureRunners.add(new CreatureRunner(creatureType, game.getWorld()));
        }
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(8);
        for (CreatureRunner creatureRunner : creatureRunners) {
            fixedThreadPool.submit(creatureRunner);
        }
        fixedThreadPool.shutdown();

        try {
            if (fixedThreadPool.awaitTermination(Integer.MAX_VALUE, TimeUnit.MILLISECONDS)) {
                game.showStatistics();
            }
        } catch (InterruptedException e) {

            System.out.println("The game is finished");
        }
    }

    private void runTimer() {
        try {
            Thread.sleep(GAME_DURATION);
        } catch (InterruptedException e) {
            System.out.println("The game is already finished");
        }
        System.out.println("Armageddon!!!");
    }
}
