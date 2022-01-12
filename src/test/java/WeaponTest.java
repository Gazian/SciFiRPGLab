import characteritems.Weapon;
import characteritems.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;
    Weapon weapon2;
    Weapon weapon3;

    @Before
    public void before(){
        weapon = new Weapon(WeaponType.RAILGUN);
    }

    @Test
    public void weaponHasType(){
        assertEquals(WeaponType.RAILGUN,weapon.getWeaponType());
    }

    @Test
    public void railgunWeaponHasValue8(){
        assertEquals(8,weapon.getWeaponDamage());
    }

    @Test
    public void pulseRifleHasType(){
        weapon2 = new Weapon(WeaponType.PULSERIFLE);
        assertEquals(WeaponType.PULSERIFLE,weapon2.getWeaponType());
    }

    @Test
    public void pulseRifleWeaponHasValue6(){
        weapon2 = new Weapon(WeaponType.PULSERIFLE);
        assertEquals(6,weapon2.getWeaponDamage());
    }

    @Test
    public void particleCannonHasType(){
        weapon3 = new Weapon(WeaponType.PARTICLECANNON);
        assertEquals(WeaponType.PARTICLECANNON,weapon3.getWeaponType());
    }

    @Test
    public void particleCannonWeaponHasValue10(){
        weapon3 = new Weapon(WeaponType.PARTICLECANNON);
        assertEquals(10,weapon3.getWeaponDamage());
    }



}
