package Array;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {6, 4, 9, 6, 3, 2, 0};
        System.out.print("Elements after sorting:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("The second largest element is: " + arr[arr.length - 2]);
    }
}
