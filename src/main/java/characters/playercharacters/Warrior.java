package characters.playercharacters;

import characters.Character;

import characteritems.WeaponType;


public class Warrior extends Character{

    private WarriorType warriorType;
    private WeaponType weaponType;

    public Warrior(String name, int health, WarriorType warriorType, WeaponType weaponType) {
        super(name,health);
        this.warriorType = warriorType;
        this.weaponType = weaponType;

    }

    public WarriorType getWarriorType() {
        return warriorType;
    }

    ;public WeaponType getWeaponType(){
        return weaponType;
    }
}
