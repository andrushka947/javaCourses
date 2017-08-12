package CollectionTest.util;

import CollectionTest.model.UserMeal;
import CollectionTest.model.UserMealAdapter;
import CollectionTest.model.UserMealWithExceed;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,13,0), "Обед", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,20,0), "Ужин", 500),

                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,10,0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,13,0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,20,0), "Ужин", 510)
        );
        getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000);
//        .toLocalDate();
//        .toLocalTime();
    }

    public static List<UserMealWithExceed>  getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
        Map<Integer, Integer> dayWithCalories = mealList.
                stream().
                collect(Collectors.groupingBy(meal -> meal.getDateTime().getDayOfYear(), Collectors.summingInt(UserMeal::getCalories)));

        List<UserMealWithExceed> result = mealList.stream().
                filter(meal -> TimeUtil.isBetween(LocalTime.from(meal.getDateTime()), startTime, endTime)).
                map(s -> UserMealAdapter.createUserMealWithExceed(s, dayWithCalories.get(s.getDateTime().getDayOfYear()), caloriesPerDay)).
                collect(Collectors.toList());

        result.forEach(s -> System.out.println(s.getDateTime() + " : " + s.isExceed()));

        return result;
    }

}

//Map<Integer, Integer> dayWithCalories = new HashMap<>();

        /*for (UserMeal meal : mealList) {
            if (dayWithCalories.containsKey(meal.getDateTime().getDayOfYear())) {
                int thisDay = meal.getDateTime().getDayOfYear();
                int thisDayCalories = meal.getCalories();
                dayWithCalories.put(thisDay, dayWithCalories.getOrDefault(thisDay, 0) + thisDayCalories);
            } else {
                dayWithCalories.merge(meal.getDateTime().getDayOfYear(), meal.getCalories(), (v1,v2) -> v2);
            }
        }
*/

/*
for (UserMeal meal : mealList) {
            if (TimeUtil.isBetween(LocalTime.from(meal.getDateTime()), startTime, endTime)) {
                result.add(UserMealAdapter.createUserMealWithExceed(meal, dayWithCalories.get(meal.getDateTime().getDayOfYear()),caloriesPerDay));
            }
        }
*/