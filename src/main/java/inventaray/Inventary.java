package inventaray;

public abstract class Inventary {
    public float getPrice() {
        return price;
    }

    float price;

    public Inventary(float price){
        this.price = price;
    }

    @Override
    public String toString() {
        return String.valueOf(price);
    }

}
