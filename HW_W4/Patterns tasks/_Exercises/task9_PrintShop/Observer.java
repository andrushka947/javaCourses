package _Exercises.task9_PrintShop;

public interface Observer {
    void handleEvent(String magazineName);

    void addCustomer(Customer customer);
    void removeCustomer(Customer customer);
}
