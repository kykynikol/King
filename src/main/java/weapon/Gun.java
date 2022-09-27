package weapon;

public class Gun extends Weapon implements IWeapon{
    public Gun(int damage, float price) {
        super(damage, price);
    }



    @Override
    public int damage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Пушка"+ super.toString();
    }
}
