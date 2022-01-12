package characters.enemies;

import attackforms.Weapon;
import characters.Character;

import java.util.ArrayList;

public class Enemy extends Character {
    private EnemyType enemyType;
    private ArrayList<Weapon> weapons;
    public Enemy(EnemyType enemyType, String name, int health) {
        super(name, health);
        this.enemyType = enemyType;
    }

    public EnemyType getEnemyType(){
        return this.enemyType;
    }
}
