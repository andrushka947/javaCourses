package Behavioral.Template_method;

public class A extends C {
    @Override
    void differentPart() {
        System.out.println("2");
    }

    @Override
    void differentPart2() {
        System.out.println(4);
    }
}
