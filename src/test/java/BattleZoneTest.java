import battlezones.BattleZone;
import battlezones.Factory;
import characters.enemies.Enemy;
import characters.enemies.EnemyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BattleZoneTest {

    Enemy enemy1;
    Factory factory;

    @Before
    public void before(){
        factory = new Factory("Chamber of doom");
        enemy1 = new Enemy(EnemyType.REPLICANT,"Deccard",50);

    }

    @Test
    public void checkName(){
        assertEquals("Chamber of doom",factory.getName());
    }

    @Test
    public void checkRoomContainsEmpty(){
        assertEquals(0, factory.getRoomContains().size());
    }
    @Test
    public void checkRoomContainsEnemy(){
        factory.addToRoom(enemy1);
        assertEquals(enemy1, factory.getRoomContains().get(0));
    }
}
