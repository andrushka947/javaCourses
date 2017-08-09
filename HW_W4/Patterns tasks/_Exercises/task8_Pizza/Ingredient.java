package _Exercises.task8_Pizza;

public abstract class Ingredient {
    private double price;
    private String name;

    public Ingredient(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "{name='" +name + '\'' +
                ", price=" + price +
                '}';
    }
}
