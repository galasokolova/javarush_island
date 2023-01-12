package domain.factory;

import domain.settings.CreaturesParameters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrganismCreator {

    Map<String, String> nameAndImage = new HashMap<>();
    List<SameTypeCreature> sameTypeCreatureSet = new ArrayList<>();
    public synchronized Map<String, String>  getImageByType(){
        nameAndImage.put(BEAR.getName(), BEAR.getImage());
        nameAndImage.put(BOA.getName(), BOA.getImage());
        nameAndImage.put(BOAR.getName(), BOAR.getImage());
        nameAndImage.put(BUFFALO.getName(), BUFFALO.getImage());
        nameAndImage.put(CATERPILLAR.getName(), CATERPILLAR.getImage());
        nameAndImage.put(DEER.getName(), DEER.getImage());
        nameAndImage.put(DUCK.getName(), DUCK.getImage());
        nameAndImage.put(EAGLE.getName(), EAGLE.getImage());
        nameAndImage.put(FOX.getName(), FOX.getImage());
        nameAndImage.put(GOAT.getName(), GOAT.getImage());
        nameAndImage.put(HORSE.getName(), HORSE.getImage());
        nameAndImage.put(MOUSE.getName(), MOUSE.getImage());
        nameAndImage.put(PLANT.getName(), PLANT.getImage());
        nameAndImage.put(RABBIT.getName(), RABBIT.getImage());
        nameAndImage.put(SHEEP.getName(), SHEEP.getImage());
        nameAndImage.put(WOLF.getName(), WOLF.getImage());
        return nameAndImage;
    }
    public List<SameTypeCreature> getTypeList(){
        sameTypeCreatureSet.add(BEAR);
        sameTypeCreatureSet.add(BOA);
        sameTypeCreatureSet.add(BOAR);
        sameTypeCreatureSet.add(BUFFALO);
        sameTypeCreatureSet.add(CATERPILLAR);
        sameTypeCreatureSet.add(DEER);
        sameTypeCreatureSet.add(DUCK);
        sameTypeCreatureSet.add(EAGLE);
        sameTypeCreatureSet.add(FOX);
        sameTypeCreatureSet.add(GOAT);
        sameTypeCreatureSet.add(HORSE);
        sameTypeCreatureSet.add(MOUSE);
        sameTypeCreatureSet.add(PLANT);
        sameTypeCreatureSet.add(RABBIT);
        sameTypeCreatureSet.add(SHEEP);
        sameTypeCreatureSet.add(WOLF);

        return sameTypeCreatureSet;
    }
    public static final SameTypeCreature BEAR = new SameTypeCreature(CreaturesParameters.BEAR_BASIC_PARAMETERS.getName(),
            CreaturesParameters.BEAR_BASIC_PARAMETERS.getImage(),
            CreaturesParameters.BEAR_BASIC_PARAMETERS.getMaxWeight(),
            CreaturesParameters.BEAR_BASIC_PARAMETERS.getMaxQuantityPerCell(),
            CreaturesParameters.BEAR_BASIC_PARAMETERS.getSpeed(),
            CreaturesParameters.BEAR_BASIC_PARAMETERS.getSatiety());
    public static final SameTypeCreature BOA = new SameTypeCreature(CreaturesParameters.BOA_BASIC_PARAMETERS.getName(),
            CreaturesParameters.BOA_BASIC_PARAMETERS.getImage(),
            CreaturesParameters.BOA_BASIC_PARAMETERS.getMaxWeight(),
            CreaturesParameters.BOA_BASIC_PARAMETERS.getMaxQuantityPerCell(),
            CreaturesParameters.BOA_BASIC_PARAMETERS.getSpeed(),
            CreaturesParameters.BOA_BASIC_PARAMETERS.getSatiety());
    public static final SameTypeCreature BOAR = new SameTypeCreature(CreaturesParameters.BOAR_BASIC_PARAMETERS.getName(),
            CreaturesParameters.BOAR_BASIC_PARAMETERS.getImage(),
            CreaturesParameters.BOAR_BASIC_PARAMETERS.getMaxWeight(),
            CreaturesParameters.BOAR_BASIC_PARAMETERS.getMaxQuantityPerCell(),
            CreaturesParameters.BOAR_BASIC_PARAMETERS.getSpeed(),
            CreaturesParameters.BOAR_BASIC_PARAMETERS.getSatiety());
    public static final SameTypeCreature BUFFALO = new SameTypeCreature(CreaturesParameters.BUFFALO_BASIC_PARAMETERS.getName(),
            CreaturesParameters.BUFFALO_BASIC_PARAMETERS.getImage(),
            CreaturesParameters.BUFFALO_BASIC_PARAMETERS.getMaxWeight(),
            CreaturesParameters.BUFFALO_BASIC_PARAMETERS.getMaxQuantityPerCell(),
            CreaturesParameters.BUFFALO_BASIC_PARAMETERS.getSpeed(),
            CreaturesParameters.BUFFALO_BASIC_PARAMETERS.getSatiety());
    public static final SameTypeCreature CATERPILLAR = new SameTypeCreature(CreaturesParameters.CATERPILLAR_BASIC_PARAMETERS.getName(),
            CreaturesParameters.CATERPILLAR_BASIC_PARAMETERS.getImage(),
            CreaturesParameters.CATERPILLAR_BASIC_PARAMETERS.getMaxWeight(),
            CreaturesParameters.CATERPILLAR_BASIC_PARAMETERS.getMaxQuantityPerCell(),
            CreaturesParameters.CATERPILLAR_BASIC_PARAMETERS.getSpeed(),
            CreaturesParameters.CATERPILLAR_BASIC_PARAMETERS.getSatiety());
    public static final SameTypeCreature DEER = new SameTypeCreature(CreaturesParameters.DEER_BASIC_PARAMETERS.getName(),
            CreaturesParameters.DEER_BASIC_PARAMETERS.getImage(),
            CreaturesParameters.DEER_BASIC_PARAMETERS.getMaxWeight(),
            CreaturesParameters.DEER_BASIC_PARAMETERS.getMaxQuantityPerCell(),
            CreaturesParameters.DEER_BASIC_PARAMETERS.getSpeed(),
            CreaturesParameters.DEER_BASIC_PARAMETERS.getSatiety());
    public static final SameTypeCreature DUCK = new SameTypeCreature(CreaturesParameters.DUCK_BASIC_PARAMETERS.getName(),
            CreaturesParameters.DUCK_BASIC_PARAMETERS.getImage(),
            CreaturesParameters.DUCK_BASIC_PARAMETERS.getMaxWeight(),
            CreaturesParameters.DUCK_BASIC_PARAMETERS.getMaxQuantityPerCell(),
            CreaturesParameters.DUCK_BASIC_PARAMETERS.getSpeed(),
            CreaturesParameters.DUCK_BASIC_PARAMETERS.getSatiety());
    public static final SameTypeCreature EAGLE = new SameTypeCreature(CreaturesParameters.EAGLE_BASIC_PARAMETERS.getName(),
            CreaturesParameters.EAGLE_BASIC_PARAMETERS.getImage(),
            CreaturesParameters.EAGLE_BASIC_PARAMETERS.getMaxWeight(),
            CreaturesParameters.EAGLE_BASIC_PARAMETERS.getMaxQuantityPerCell(),
            CreaturesParameters.EAGLE_BASIC_PARAMETERS.getSpeed(),
            CreaturesParameters.EAGLE_BASIC_PARAMETERS.getSatiety());
    public static final SameTypeCreature FOX = new SameTypeCreature(CreaturesParameters.FOX_BASIC_PARAMETERS.getName(),
            CreaturesParameters.FOX_BASIC_PARAMETERS.getImage(),
            CreaturesParameters.FOX_BASIC_PARAMETERS.getMaxWeight(),
            CreaturesParameters.FOX_BASIC_PARAMETERS.getMaxQuantityPerCell(),
            CreaturesParameters.FOX_BASIC_PARAMETERS.getSpeed(),
            CreaturesParameters.FOX_BASIC_PARAMETERS.getSatiety());
    public static final SameTypeCreature GOAT = new SameTypeCreature(CreaturesParameters.GOAT_BASIC_PARAMETERS.getName(),
            CreaturesParameters.GOAT_BASIC_PARAMETERS.getImage(),
            CreaturesParameters.GOAT_BASIC_PARAMETERS.getMaxWeight(),
            CreaturesParameters.GOAT_BASIC_PARAMETERS.getMaxQuantityPerCell(),
            CreaturesParameters.GOAT_BASIC_PARAMETERS.getSpeed(),
            CreaturesParameters.GOAT_BASIC_PARAMETERS.getSatiety());
    public static final SameTypeCreature HORSE = new SameTypeCreature(CreaturesParameters.HORSE_BASIC_PARAMETERS.getName(),
            CreaturesParameters.HORSE_BASIC_PARAMETERS.getImage(),
            CreaturesParameters.HORSE_BASIC_PARAMETERS.getMaxWeight(),
            CreaturesParameters.HORSE_BASIC_PARAMETERS.getMaxQuantityPerCell(),
            CreaturesParameters.HORSE_BASIC_PARAMETERS.getSpeed(),
            CreaturesParameters.HORSE_BASIC_PARAMETERS.getSatiety());
    public static final SameTypeCreature MOUSE = new SameTypeCreature(CreaturesParameters.MOUSE_BASIC_PARAMETERS.getName(),
            CreaturesParameters.MOUSE_BASIC_PARAMETERS.getImage(),
            CreaturesParameters.MOUSE_BASIC_PARAMETERS.getMaxWeight(),
            CreaturesParameters.MOUSE_BASIC_PARAMETERS.getMaxQuantityPerCell(),
            CreaturesParameters.MOUSE_BASIC_PARAMETERS.getSpeed(),
            CreaturesParameters.MOUSE_BASIC_PARAMETERS.getSatiety());
    public static final SameTypeCreature PLANT = new SameTypeCreature(CreaturesParameters.PLANT_BASIC_PARAMETERS.getName(),
            CreaturesParameters.PLANT_BASIC_PARAMETERS.getImage(),
            CreaturesParameters.PLANT_BASIC_PARAMETERS.getMaxWeight(),
            CreaturesParameters.PLANT_BASIC_PARAMETERS.getMaxQuantityPerCell(),
            CreaturesParameters.PLANT_BASIC_PARAMETERS.getSpeed(),
            CreaturesParameters.PLANT_BASIC_PARAMETERS.getSatiety());
    public static final SameTypeCreature RABBIT = new SameTypeCreature(CreaturesParameters.RABBIT_BASIC_PARAMETERS.getName(),
            CreaturesParameters.RABBIT_BASIC_PARAMETERS.getImage(),
            CreaturesParameters.RABBIT_BASIC_PARAMETERS.getMaxWeight(),
            CreaturesParameters.RABBIT_BASIC_PARAMETERS.getMaxQuantityPerCell(),
            CreaturesParameters.RABBIT_BASIC_PARAMETERS.getSpeed(),
            CreaturesParameters.RABBIT_BASIC_PARAMETERS.getSatiety());
    public static final SameTypeCreature SHEEP = new SameTypeCreature(CreaturesParameters.SHEEP_BASIC_PARAMETERS.getName(),
            CreaturesParameters.SHEEP_BASIC_PARAMETERS.getImage(),
            CreaturesParameters.SHEEP_BASIC_PARAMETERS.getMaxWeight(),
            CreaturesParameters.SHEEP_BASIC_PARAMETERS.getMaxQuantityPerCell(),
            CreaturesParameters.SHEEP_BASIC_PARAMETERS.getSpeed(),
            CreaturesParameters.SHEEP_BASIC_PARAMETERS.getSatiety());
    public static final SameTypeCreature WOLF = new SameTypeCreature(CreaturesParameters.WOLF_BASIC_PARAMETERS.getName(),
            CreaturesParameters.WOLF_BASIC_PARAMETERS.getImage(),
            CreaturesParameters.WOLF_BASIC_PARAMETERS.getMaxWeight(),
            CreaturesParameters.WOLF_BASIC_PARAMETERS.getMaxQuantityPerCell(),
            CreaturesParameters.WOLF_BASIC_PARAMETERS.getSpeed(),
            CreaturesParameters.WOLF_BASIC_PARAMETERS.getSatiety());

}
