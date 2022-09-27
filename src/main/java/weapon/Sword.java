package weapon;

public class Sword extends Weapon implements IWeapon{
    String name;

    public Sword(String name, int damage, float price) {
        super(damage, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Меч"+ super.toString();
    }

    @Override
    public int damage() {
        return damage;
    }
}
