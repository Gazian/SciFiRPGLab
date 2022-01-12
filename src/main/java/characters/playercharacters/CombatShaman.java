package characters.playercharacters;

import characteritems.DefenceType;
import characters.Character;

public class CombatShaman extends Character {

    private DefenceType defenceType;

    public CombatShaman(String name, int health, DefenceType defenceType){
        super(name,health);
        this.defenceType = defenceType;

    }
    public DefenceType getDefenceType(){
        return this.defenceType;
    }




}
