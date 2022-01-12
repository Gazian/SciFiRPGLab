package characters.playercharacters;

import attackforms.CyberType;
import characters.Character;
import defencebots.Bot;
import defencebots.BotType;

public class CyberPunk extends Character {

    CyberType cyberType;
    BotType botType;

    public CyberPunk(String name, int health, CyberType cyberType, BotType botType) {
        super(name, health);
        this.cyberType = cyberType;
        this.botType = botType;
    }

    public CyberType getCyberType(){
        return this.cyberType;
    }

    public BotType getBotType(){
        return this.botType;
    }

}
