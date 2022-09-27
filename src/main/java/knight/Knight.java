package knight;

import armor.IArmor;
import inventaray.Inventary;
import weapon.IWeapon;
import weapon.Weapon;

public class Knight implements IArmor, IWeapon {
    String name;
    int hp;
    float money;

    Inventary[] inventaries;
    int count;

    public Knight(String name, int hp, float money){
        this.hp = hp;
        this.money = money;
        this.name = name;

        inventaries = new Inventary[6];
        count = 0;

    }

    public void buy(Inventary inventary) {
        if (count < inventaries.length) {
            if (money >= inventary.getPrice()) {
                inventaries[count++] = inventary;
                this.money -= inventary.getPrice();
            }else {
                throw new RuntimeException();
            }
        }else {
            throw new BagException();
        }
    }

    @Override
    public int defend(int damage) {
        return 0;
    }

    @Override
    public int damage() {
        return 0;
    }
}
