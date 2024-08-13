package singleton_factory_abstractfactory;


public class MediumEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new MediumEnemy();
    }
}