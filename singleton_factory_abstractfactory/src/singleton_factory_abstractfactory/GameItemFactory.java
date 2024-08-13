package singleton_factory_abstractfactory;
public abstract class GameItemFactory {
    public abstract Weapon createWeapon();
    public abstract PowerUp createPowerUp();
}