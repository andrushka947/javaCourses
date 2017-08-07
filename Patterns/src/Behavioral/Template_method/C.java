package Behavioral.Template_method;

public abstract class C {
    void templateMethod() {
        System.out.println(1);
        differentPart();
        System.out.println(3);
        differentPart2();
    };

    abstract void differentPart();
    abstract void differentPart2();
}
