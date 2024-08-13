package singleton_factory_abstractfactory;

public class MediumGameItemFactory extends GameItemFactory {
    @Override
    public Weapon createWeapon() {
        return new MediumWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new MediumPowerUp();
    }
}
