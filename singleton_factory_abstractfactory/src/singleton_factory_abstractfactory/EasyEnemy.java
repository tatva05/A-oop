package singleton_factory_abstractfactory;

public class EasyEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Easy Enemy attacks weakly!");
    }
}