package Factory;

public class main {
    public static void main(String[] args) {
        Phone phone = new IphoneFactory().makePhone();
        phone.create();
    }
}
