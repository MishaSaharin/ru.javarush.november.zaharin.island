package game.entities.setting;

import game.entities.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Setting {
    private Map<Class<? extends Animal>, GeneralBasicParameters> preferences = new HashMap<>();
    private static final Setting instance = new Setting();
    private static volatile Setting SETTINGS;

    private Setting() {
        initialize();
    }

    private void initialize() {
        preferences.put(Wolf.class, new GeneralBasicParameters(Wolf.class, 50d, 30, 3, 8d));
        preferences.put(Boa.class, new GeneralBasicParameters(Boa.class, 15d, 30, 1, 3d));
        preferences.put(Fox.class, new GeneralBasicParameters(Fox.class, 8d, 30, 2, 2d));
        preferences.put(Bear.class, new GeneralBasicParameters(Bear.class, 500d, 5, 2, 80d));
        preferences.put(Eagle.class, new GeneralBasicParameters(Eagle.class, 6d, 20, 3, 1d));
        preferences.put(Horse.class, new GeneralBasicParameters(Horse.class, 400d, 20, 4, 60d));
        preferences.put(Deer.class, new GeneralBasicParameters(Deer.class, 300d, 20, 4, 50d));
        preferences.put(Rabbit.class, new GeneralBasicParameters(Rabbit.class, 2d, 150, 2, 0.45d));
        preferences.put(Mouse.class, new GeneralBasicParameters(Mouse.class, 0.05d, 500, 1, 0.01d));
        preferences.put(Goat.class, new GeneralBasicParameters(Goat.class, 60d, 140, 3, 10d));
        preferences.put(Sheep.class, new GeneralBasicParameters(Sheep.class, 70d, 140, 3, 15d));
        preferences.put(Boar.class, new GeneralBasicParameters(Boar.class, 400d, 50, 2, 50d));
        preferences.put(Buffalo.class, new GeneralBasicParameters(Buffalo.class, 700d, 10, 3, 100d));
        preferences.put(Duck.class, new GeneralBasicParameters(Duck.class, 1d, 200, 4, 0.15d));
        preferences.put(Caterpillar.class, new GeneralBasicParameters(Caterpillar.class, 0.01d, 1000, 0, 0d));
        preferences.put(Plant.class, new GeneralBasicParameters(Plant.class, 1d, 200, 0, 0d));
    }

    public static Setting getInstance() {
        return instance;
    }

    public Map<Class<? extends Animal>, GeneralBasicParameters> getMap() {
        return preferences;
    }

    public static Setting get() {
        Setting settings = SETTINGS;

        if (Objects.isNull(settings)) {
            synchronized (Setting.class) {
                if (Objects.isNull(settings = SETTINGS)) {
                    settings = SETTINGS = new Setting();
                }
            }
        }
        return settings;
    }

    public GeneralBasicParameters getGeneralBasicParameters(Class<? extends Animal> aClass) {
        return preferences.get(aClass);
    }
}
