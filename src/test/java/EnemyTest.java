import characteritems.Weapon;
import characteritems.WeaponType;
import characters.enemies.Enemy;
import characters.enemies.EnemyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    Enemy enemy;
    Weapon weapon;


    @Before
    public void before(){
        enemy = new Enemy(EnemyType.REPLICANT,"Rick Deckard",10);
    }

    @Test
    public void hasEnemyType(){
        assertEquals(EnemyType.REPLICANT,enemy.getEnemyType());
    }

    @Test
    public void hasEnemyName(){
        assertEquals("Rick Deckard",enemy.getName());
    }

    @Test
    public void hasEnemyHealth(){
        assertEquals(10,enemy.getHealth());
    }

    @Test
    public void enemyStartsWithEmptyWeaponCache(){
        assertEquals(0,enemy.getWeaponsCache().size());
    }
    
    @Test
    public void enemyHasAWeapon(){
        weapon = new Weapon(WeaponType.PULSERIFLE);
        enemy.addWeapon(weapon);
        assertEquals(1,enemy.getWeaponsCache().size());
    }


}
