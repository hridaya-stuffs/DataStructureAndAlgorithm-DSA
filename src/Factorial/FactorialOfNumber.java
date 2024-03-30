package Factorial;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorialNumber = findFactorial(n);

        System.out.println("Factorial of given number is: " + factorialNumber);
    }

    static int findFactorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * findFactorial(n - 1);
    }
}
