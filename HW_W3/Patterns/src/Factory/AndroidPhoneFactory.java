package Factory;

public class AndroidPhoneFactory implements PhoneFactory {
    @Override
    public Phone makePhone() {
        return new AndroidPhone();
    }
}
