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
        System.out.printf(message, number);
    }
    public void printMessage (String message, int from, int to) {
        System.out.printf(message, from, to);
        System.out.println();
    }

}
