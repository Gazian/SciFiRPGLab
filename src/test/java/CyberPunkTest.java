import characteritems.CyberType;
import characters.playercharacters.CyberPunk;
import characters.playercharacters.CyberPunkType;
import defencebots.BotType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CyberPunkTest {

    CyberPunk cyberpunk;

    @Before
    public void before() {
        cyberpunk = new CyberPunk( "Neo",200, CyberPunkType.HACKER ,CyberType.SHIELDOVERLOAD, BotType.FLAMEDRONE);
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
    public void hasCyberPunkType(){
        assertEquals(CyberPunkType.HACKER, cyberpunk.getCyberPunkType());
    }
    @Test
    public void checkCyberType(){
        assertEquals(CyberType.SHIELDOVERLOAD,cyberpunk.getCyberType());
    }


    @Test
    public void checkBotType(){
        assertEquals(BotType.FLAMEDRONE,cyberpunk.getBotType());
    }
}
