package Factory;

public class AndroidPhone implements Phone {
    @Override
    public void create() {
        System.out.println("Android phone");
    }
}
