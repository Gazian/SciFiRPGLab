package characters.playercharacters;

import characteritems.CyberType;
import characters.Character;
import defencebots.BotType;

public class CyberPunk extends Character {

    CyberPunkType cyberpunktype;
    CyberType cyberType;
    BotType botType;

    public CyberPunk(String name, int health, CyberPunkType cyberpunktype, CyberType cyberType, BotType botType) {
        super(name, health);
        this.cyberpunktype = cyberpunktype;
        this.cyberType = cyberType;
        this.botType = botType;
    }

    public CyberType getCyberType(){
        return this.cyberType;
    }

    public BotType getBotType(){
        return this.botType;
    }

    public CyberPunkType getCyberPunkType(){
        return this.cyberpunktype;
    }
}
