package Behavioral.Template_method;

public class main {
    public static void main(String[] args) {
         C a = new A();
         C b = new B();
         a.templateMethod();
         System.out.println("_________");
         b.templateMethod();
    }
}
