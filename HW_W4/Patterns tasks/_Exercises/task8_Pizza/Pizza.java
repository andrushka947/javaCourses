package _Exercises.task8_Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private double price;
    private List<Ingredient> ingredientList = new ArrayList<>();
    private static PizzaFactory factory = new PizzaFactory();

    public void addIngredient(IngredientNames ingredientName) {
        Ingredient ingredient = factory.getIngredient(ingredientName.getName());
        ingredientList.add(ingredient);
        price += ingredient.getPrice() * 1.1;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price=" + price +
                ", ingredientList=" + ingredientList.toString() +
                '}';
    }
}
