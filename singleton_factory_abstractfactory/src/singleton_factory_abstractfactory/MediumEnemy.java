package singleton_factory_abstractfactory;

public class MediumEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Medium Enemy attacks moderately!");
    }
}