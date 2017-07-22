import java.util.Arrays;
import java.util.List;

public class View {

    public static String RULES = "The computer made a number between %s and %s. You have to guess it!";
    public static String STEP = "Input number from %s to %s";
    public static String BIGGER_VALUE = "Miss. Try bigger value from %s to %s!";
    public static String SMALLER_VALUE = "Miss. Try lower value from %s to %s!";
    public static String WRONG_VALUE = "The input symbol isn't a number!";
    public static String OUT_OF_RANGE = "The input number is out of range!";
    public static String SUCCESS = "You have find the number: %s";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(String message, int number) {
        System.out.printf(message, number + "\n");
    }

    public void printMessage (String message, Model model) {
        System.out.printf(message, model.getLowEdge(), model.getTopEdge());
        System.out.println();
    }

    public void printAllInputValues(List<Integer>list){
        System.out.println("Your input values: " +  Arrays.deepToString(list.toArray()));;
    }

}
