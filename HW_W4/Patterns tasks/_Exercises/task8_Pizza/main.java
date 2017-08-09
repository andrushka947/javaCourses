package _Exercises.task8_Pizza;

public class main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza();
        pizza.addIngredient(IngredientNames.THIN_DOUGH);
        pizza.addIngredient(IngredientNames.REGULAR_SAUCE);
        pizza.addIngredient(IngredientNames.MOZZARELLA);
        pizza.addIngredient(IngredientNames.TOMATOES);
        pizza.addIngredient(IngredientNames.CHICKEN);
        pizza.addIngredient(IngredientNames.SALAMI);
        pizza.addIngredient(IngredientNames.GREEN_PEPPER);

        System.out.println(pizza);

    }
}
