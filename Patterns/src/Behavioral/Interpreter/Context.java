package Behavioral.Interpreter;

public class Context {

    Expression evaluate(String s){
        int pos = s.length() - 1;
        while (pos > 0) {
            if (Character.isDigit(s.charAt(pos))) pos--;
            else {
                Expression left = evaluate(s.substring(0, pos));
                Expression right = new NumberExp(Integer.valueOf(s.substring(pos + 1, s.length())));
                char operator = s.charAt(pos);
                switch (operator) {
                    case '-': return new MinusExp(left, right);
                    case '+':return new PlusExp(left, right);
                }
            }
        }
        int result = Integer.valueOf(s);
        return new NumberExp(result);
    }

}
