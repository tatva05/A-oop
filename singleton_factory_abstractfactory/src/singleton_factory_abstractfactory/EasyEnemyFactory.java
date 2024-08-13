package singleton_factory_abstractfactory;


public class EasyEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new EasyEnemy();
    }
}