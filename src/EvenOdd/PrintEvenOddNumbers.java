package EvenOdd;

public class PrintEvenOddNumbers {
    public static void main(String[] args) {
        int start = 10;
        int end = 100;

        System.out.println("Numbers start from " + start + "and end at " + end);

        System.out.println("Even numbers :");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Odd numbers :");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
