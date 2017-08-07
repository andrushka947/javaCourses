package Behavioral.Strategy;

public class FirstNumber implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println(arr[0]);
    }
}
