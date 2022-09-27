package weapon;

import inventaray.Inventary;

public class Weapon extends Inventary {
    int damage;

    public Weapon(int damage, float price) {
        super(price);
    }

    @Override
    public String toString() {
        return super.toString()+ " " + damage;
    }
}
