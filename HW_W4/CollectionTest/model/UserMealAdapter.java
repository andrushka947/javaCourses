package CollectionTest.model;

public class UserMealAdapter {

    public static UserMealWithExceed createUserMealWithExceed(UserMeal userMeal, int calories, int caloriesPerDay) {
        if (calories > caloriesPerDay) {
            return new UserMealWithExceed(userMeal.getDateTime(), userMeal.getDescription(), userMeal.getCalories(), true);
        } else {
            return new UserMealWithExceed(userMeal.getDateTime(), userMeal.getDescription(), userMeal.getCalories(), false);
        }
    }
}
