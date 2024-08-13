package singleton_factory_abstractfactory;


public class HardGameItemFactory extends GameItemFactory {
    @Override
    public Weapon createWeapon() {
        return new HardWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new HardPowerUp();
    }
}