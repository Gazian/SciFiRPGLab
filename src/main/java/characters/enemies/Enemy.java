package characters.enemies;

import characteritems.Weapon;
import characteritems.WeaponType;
import characters.Character;

import java.util.ArrayList;

public class Enemy extends Character {
    private EnemyType enemyType;
    private ArrayList<Weapon> weapons;
    public Enemy(EnemyType enemyType, String name, int health) {
        super(name, health);
        this.enemyType = enemyType;
        this.weapons = new ArrayList<>();
    }

    public EnemyType getEnemyType(){
        return this.enemyType;
    }

    public ArrayList getWeaponsCache(){
        return this.weapons;
    }

    public void addWeapon(Weapon weapon){
        weapons.add(weapon);
    }
}
