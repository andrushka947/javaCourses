package _Exercises.task9_PrintShop;

import Behavioral.State.v2.Human;

public class main {
    public static void main(String[] args) {
        
        Observer sms = new SMSNotifier();
        Observer email = new EmailNotifier();

        Customer andrey = new Customer("andrey");
        Customer yulia = new Customer("yulia");
        Customer jeka = new Customer("jeka");
        Customer sasha = new Customer("sasha");
        Customer anya = new Customer("anya");

        sms.addCustomer(andrey);
        sms.addCustomer(anya);
        sms.addCustomer(sasha);
        email.addCustomer(andrey);
        email.addCustomer(jeka);
        email.addCustomer(yulia);

        PrintShop shop = new PrintShop();
        shop.addObserver(sms);
        shop.addObserver(email);

        shop.addMagazine("Nissan Skyline R-34 GT-R");
    }
}
