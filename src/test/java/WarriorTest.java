import characteritems.WeaponType;
import characters.playercharacters.Warrior;
import characters.playercharacters.WarriorType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;

    @Before
    public void before(){
        warrior = new Warrior("Master chief", 400, WarriorType.SPACECOMMANDO, WeaponType.PULSERIFLE);
    }

    @Test
    public void hasName(){
        assertEquals("Master chief",warrior.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(400, warrior.getHealth());
    }

    @Test
    public void hasWarriorType(){
        assertEquals(WarriorType.SPACECOMMANDO,warrior.getWarriorType());
    }

    @Test
    public void hasWeapon(){
        assertEquals(WeaponType.PULSERIFLE, warrior.getWeaponType());
    }
}
