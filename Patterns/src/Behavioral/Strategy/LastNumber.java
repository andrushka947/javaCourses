package Behavioral.Strategy;

public class LastNumber implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println(arr[arr.length-1]);
    }
}