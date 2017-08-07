package Behavioral.Interpreter;

public class main {
    public static void main(String[] args) {

        Context context = new Context();
        Expression exp = context.evaluate("1+2-3");
        System.out.println(exp.interpret());

    }
}
