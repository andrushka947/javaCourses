package _Exercises.task9_PrintShop;

import java.util.ArrayList;
import java.util.List;

public class SMSNotifier implements Observer {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    @Override
    public void handleEvent(String magazineName) {
        for (Customer customer : customers) {
            System.out.println("SMS to : " + customer.getName() + ". New magazine: " + magazineName);
        }
    }
}
