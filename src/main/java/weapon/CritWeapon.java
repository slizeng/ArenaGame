package weapon;

public class CritWeapon extends ProcWeapon {
    public CritWeapon(String name, int damage, String weaponType,int charactorDamge, int atkRounds, double rate) {
        super( name, damage, charactorDamge, atkRounds, rate );
        procName = "被暴击";
        this.weaponType = weaponType;
    }
}
