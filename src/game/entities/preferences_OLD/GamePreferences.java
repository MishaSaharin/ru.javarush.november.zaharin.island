package game.entities.preferences_OLD;

import game.entities.Organisms;

import java.util.HashMap;
import java.util.Map;

public class GamePreferences {

    private Map<Organisms, Fields> preferences = new HashMap<>();

    private static final GamePreferences instance = new GamePreferences();

    private GamePreferences() {
        initialize();
    }

    private void initialize() {
        preferences.put(Organisms.WOLF, new Fields("Волк", "\uD83D\uDC3A", 46, 50, 30, 3, 8));
        preferences.put(Organisms.SNAKE, new Fields("Удав", "\uD83D\uDC0D", 12, 15, 30, 1, 3));
        preferences.put(Organisms.FOX, new Fields("Лиса", "\uD83E\uDD8A", 6, 8, 30, 2, 2));
        preferences.put(Organisms.BEAR, new Fields("Медведь", "\uD83D\uDC3B", 450, 500, 5, 2, 80));
        preferences.put(Organisms.TURKANDJD, new Fields("Орел", "\uD83E\uDD85", 5, 6, 20, 3, 1));
        preferences.put(Organisms.HORSE, new Fields("Лошадь", "\uD83D\uDC0E", 350, 400, 20, 4, 60));
        preferences.put(Organisms.DEER, new Fields("Олень", "\uD83E\uDD8C", 260, 300, 20, 4, 50));
        preferences.put(Organisms.RABBIT, new Fields("Кролик", "\uD83D\uDC07", 1.8, 2, 150, 2, 0.45));
        preferences.put(Organisms.MOUSE, new Fields("Мышь", "\uD83D\uDC01", 0.04, 0.05, 500, 1, 0.01));
        preferences.put(Organisms.GOAT, new Fields("Коза", "\uD83D\uDC10", 50, 60, 140, 3, 10));
        preferences.put(Organisms.SHEEP, new Fields("Овца", "\uD83D\uDC11", 60, 70, 140, 3, 15));
        preferences.put(Organisms.BOAR, new Fields("Кабан", "\uD83D\uDC17", 350, 400, 50, 2, 50));
        preferences.put(Organisms.BUFFALO, new Fields("Буйвол", "\uD83D\uDC03", 600, 700, 10, 3, 100));
        preferences.put(Organisms.DUCK, new Fields("Утка", "\uD83E\uDD86", 0.8, 1, 200, 4, 0.15));
        preferences.put(Organisms.CATERPILLAR, new Fields("Гусеница", "\uD83D\uDC1B", 0.009, 0.01, 1000, 0, 0));
        preferences.put(Organisms.PLANT, new Fields("Растение", "\uD83C\uDF3F", 1, 1, 200, 0, 0));
    }

    public static GamePreferences getInstance() {
        return instance;
    }

    public Map<Organisms, Fields> getMap() {
        return preferences;
    }
}
