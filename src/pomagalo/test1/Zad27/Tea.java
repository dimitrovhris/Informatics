package pomagalo.test1.Zad27;

public class Tea extends Drink{
    private String type;


    public Tea(String type, String name, double price, String size) {
        super(name, price, size);
        this.type = type;
    }

    @Override
    public String toString(){
        return String.format("Теа: %s, Size: %s, Strength: %s, Price: %.2f", getName(), getSize(), type, getPrice());
    }
}
