package singleton_factory_abstractfactory;

public class HardEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new HardEnemy();
    }
}