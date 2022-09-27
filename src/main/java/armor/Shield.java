package armor;

public class Shield extends Armor implements IArmor{
    public Shield(int armor, float price) {
        super(armor, price);
    }

    @Override
    public int defend(int damage) {
        return 0;
    }

    @Override
    public String toString() {
        return "Щит" + super.toString();
    }
}
