package Behavioral.Interpreter;

public class NumberExp implements Expression {
    int number;

    public NumberExp(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
