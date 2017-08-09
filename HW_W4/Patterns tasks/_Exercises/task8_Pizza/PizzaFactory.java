package _Exercises.task8_Pizza;

import _Exercises.task8_Pizza.Ingredients.*;

import java.util.HashMap;
import java.util.Map;

public class PizzaFactory {
    private Map<String, Ingredient> ingredients = new HashMap<>();

    public Ingredient getIngredient(String ingredientName) {
        Ingredient ingredient = ingredients.get(ingredientName);
        if (ingredient == null) {
            switch (ingredientName) {
                case "thin dough":
                    ingredient = new ThinDough(25, IngredientNames.THIN_DOUGH.getName());
                    break;
                case "thick dough":
                    ingredient = new ThickDough(30, IngredientNames.THICK_DOUGH.getName());
                    break;
                case "bbq sauce":
                    ingredient = new BBQSauce(5, IngredientNames.BBQ_SAUCE.getName());
                    break;
                case "regular sauce":
                    ingredient = new RegularSauce(6, IngredientNames.REGULAR_SAUCE.getName());
                    break;
                case "alfredo sauce":
                    ingredient = new AlfredoSauce(7, IngredientNames.ALFREDO_SAUCE.getName());
                    break;
                case "mozzarella":
                    ingredient = new Mozzarella(10, IngredientNames.MOZZARELLA.getName());
                    break;
                case "cheddar":
                    ingredient = new Cheddar(13, IngredientNames.CHEDDAR.getName());
                    break;
                case "canadian bacon":
                    ingredient = new CanadianBacon(15, IngredientNames.CANADIAN_BACON.getName());
                    break;
                case "chicken":
                    ingredient = new Chicken(15, IngredientNames.CHICKEN.getName());
                    break;
                case "salami":
                    ingredient = new Salami(15, IngredientNames.SALAMI.getName());
                    break;
                case "sausage":
                    ingredient = new Sausage(15, IngredientNames.SAUSAGE.getName());
                    break;
                case "green pepper":
                    ingredient = new GreenPepper(10, IngredientNames.GREEN_PEPPER.getName());
                    break;
                case "onions":
                    ingredient = new Onions(8, IngredientNames.ONIONS.getName());
                    break;
                case "tomatoes":
                    ingredient = new Tomatoes(10, IngredientNames.TOMATOES.getName());
                    break;
            }
            ingredients.put(ingredientName, ingredient);
        }
        return ingredient;
    }

}
