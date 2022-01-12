package characteritems;

public enum WeaponType {

    PULSERIFLE(6),
    PARTICLECANNON(10),
    RAILGUN(8);

    private final int damage;

    WeaponType(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }
}
