package singleton_factory_abstractfactory;

public class GameClient {
    public static void main(String[] args) {
        GameState gameState = GameState.getInstance();
        System.out.println("Starting Game at Level: " + gameState.getCurrentLevel() + " with Difficulty: " + gameState.getDifficulty());

        // Create factories based on the difficulty level
        EnemyFactory enemyFactory;
        GameItemFactory itemFactory;

        switch (gameState.getDifficulty()) {
            case "Medium":
                enemyFactory = new MediumEnemyFactory();
                itemFactory = new MediumGameItemFactory();
                break;
            case "Hard":
                enemyFactory = new HardEnemyFactory();
                itemFactory = new HardGameItemFactory();
                break;
            default:
                enemyFactory = new EasyEnemyFactory();
                itemFactory = new EasyGameItemFactory();
        }

        // Create enemies, weapons, and power-ups
        Enemy enemy = enemyFactory.createEnemy();
        Weapon weapon = itemFactory.createWeapon();
        PowerUp powerUp = itemFactory.createPowerUp();

        // Interact with created objects
        enemy.attack();
        weapon.use();
        powerUp.apply();

        // Move to next level and change difficulty
        gameState.nextLevel();
        gameState.setDifficulty("Medium");

        System.out.println("Advanced to Level: " + gameState.getCurrentLevel() + " with Difficulty: " + gameState.getDifficulty());
    }
}
