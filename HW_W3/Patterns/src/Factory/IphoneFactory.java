package Factory;

public class IphoneFactory implements PhoneFactory {
    @Override
    public Phone makePhone() {
        return new IOSPhone();
    }
}
