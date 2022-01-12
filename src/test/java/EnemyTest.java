import characters.enemies.Enemy;
import characters.enemies.EnemyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    Enemy enemy;

    @Before
    public void before(){
        enemy = new Enemy(EnemyType.REPLICANT,"Rick Deckard",10);
    }

    @Test
    public void hasEnemyType(){
        assertEquals(EnemyType.REPLICANT,enemy.getEnemyType());
    }
}
