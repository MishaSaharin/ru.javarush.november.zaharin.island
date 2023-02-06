package game.entities.organisms.plants;

import game.entities.organisms.Organism;
import game.entities.settings.Settings;
import game.entities.world.Area;
import game.factories.Factories;
import game.util.Randomizer;

public class Plant extends Organism {

    public Plant() {
        super();
    }

    @Override
    public void multiply(Area area) {
        safeMultiply(area);
    }

    private void safeMultiply(Area area) {
        area.getLock().lock();
        try {
            int newPlantsQuantity = this.getChildQuantity(area);
            if (newPlantsQuantity > 0) {
                for (int i = 0; i < newPlantsQuantity; i++) {
                    if (Randomizer.getProbability(5)) {
                        Organism newPlant = Factories.createOrganismByType(this.getType());
                        area.addInhabitant(this.getType(), newPlant);
                    }
                }
            }
        } finally {
            area.getLock().unlock();
        }
    }

    public void growUp(Area area) {
        safeGrowUp(area);
    }

    private void safeGrowUp(Area area) {
        area.getLock().lock();
        try {
            int growUpPercent = Settings.get().getPlantGrowUpPercent();
            double weightIncrement = this.getWeight() * growUpPercent / 100;
            this.setWeight(this.getWeight() + weightIncrement);
        } finally {
            area.getLock().unlock();
        }
    }
}
