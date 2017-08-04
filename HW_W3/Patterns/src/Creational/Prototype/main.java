package Creational.Prototype;

public class main {
    public static void main(String[] args) {
        Human original = new Human("vasyok", 19);
        HumanFactory hf = new HumanFactory(original);

        Human h1 = hf.makeCopy();

        hf.setPrototype(new Human("Lera", 23));
        Human h2 = hf.makeCopy();

        System.out.println(original);
        System.out.println(h1);
        System.out.println(h2);


    }
}
