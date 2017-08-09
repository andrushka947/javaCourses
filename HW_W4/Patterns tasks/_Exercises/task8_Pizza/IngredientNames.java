package _Exercises.task8_Pizza;

public enum IngredientNames {
    ALFREDO_SAUCE("alfredo sauce"),
    BBQ_SAUCE("bbq sauce"),
    CANADIAN_BACON("canadian bacon"),
    CHEDDAR("cheddar"),
    CHICKEN("chicken"),
    GREEN_PEPPER("green pepper"),
    MOZZARELLA("mozzarella"),
    ONIONS("onions"),
    REGULAR_SAUCE("regular sauce"),
    SALAMI("salami"),
    SAUSAGE("sausage"),
    THIN_DOUGH("thin dough"),
    THICK_DOUGH("thick dough"),
    TOMATOES("tomatoes");

    private String name;
    IngredientNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
