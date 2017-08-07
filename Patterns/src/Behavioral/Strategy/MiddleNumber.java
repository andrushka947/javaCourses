package Behavioral.Strategy;

public class MiddleNumber implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println(arr[arr.length/2]);
    }
}