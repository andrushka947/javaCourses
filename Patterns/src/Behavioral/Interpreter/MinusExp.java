package Behavioral.Interpreter;

public class MinusExp implements Expression {
    Expression left;
    Expression right;

    public MinusExp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
