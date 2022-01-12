import characteritems.DefenceType;
import characters.playercharacters.CombatShaman;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CombatShamanTest {

    CombatShaman combatShaman;
    @Before
    public void before(){
        combatShaman  = new CombatShaman("Trinity",100, DefenceType.MEDIPACK);

    }

    @Test
    public void hasName(){
        assertEquals("Trinity", combatShaman.getName());
    }
    @Test
    public void hasHealth(){
        assertEquals(100, combatShaman.getHealth());
    }
    @Test
    public void hasDefenceType(){
        assertEquals(DefenceType.MEDIPACK, combatShaman.getDefenceType());
    }

}
