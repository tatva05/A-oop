package singleton_factory_abstractfactory;
public class EasyGameItemFactory extends GameItemFactory {
    @Override
    public Weapon createWeapon() {
        return new EasyWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new EasyPowerUp();
    }
}

