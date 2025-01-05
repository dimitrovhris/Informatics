package pomagalo.test1.Zad27;

public class Coffee extends Drink{
    private int strength;

    public Coffee(String name, double price, String size, int strength) {
        super(name, price, size);
        this.strength = strength;
    }

    @Override
    public String toString(){
        return String.format("Coffee: %s, Size: %s, Strength: %d, Price: %.2f", getName(), getSize(), this.strength, getPrice());
    }
}
