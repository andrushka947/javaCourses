package Behavioral.Interpreter;

public class PlusExp implements Expression{
    Expression left;
    Expression right;

    public PlusExp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
