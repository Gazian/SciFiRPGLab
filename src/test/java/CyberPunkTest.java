import attackforms.CyberType;
import characters.playercharacters.CyberPunk;
import defencebots.BotType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CyberPunkTest {

    CyberPunk cyberpunk;
    Character character;

    @Before
    public void before() {
        cyberpunk = new CyberPunk( "Neo",200, CyberType.SHIELDOVERLOAD, BotType.FLAMEDRONE);
    }

    @Test
    public void HasName(){
        assertEquals("Neo", cyberpunk.getName());

    }

    @Test
    public void hasHealth(){
        assertEquals(200,cyberpunk.getHealth());
    }

    @Test
    public void checkType(){
        assertEquals(CyberType.SHIELDOVERLOAD,cyberpunk.getCyberType());
    }

    @Test
    public void checkBotType(){
        assertEquals(BotType.FLAMEDRONE,cyberpunk.getBotType());
    }
}
