package singleton_factory_abstractfactory;

public class HardEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Hard Enemy attacks strongly!");
    }
}