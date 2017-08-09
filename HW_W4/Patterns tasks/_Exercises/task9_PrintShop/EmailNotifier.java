package _Exercises.task9_PrintShop;

import java.util.ArrayList;
import java.util.List;

public class EmailNotifier implements Observer{
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
            System.out.println("Email to : " + customer.getName() + ". New magazine: " + magazineName);
        }
    }
}
