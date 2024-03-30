package Sum;

public class NaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int n = 100;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of natural numbers from 1 to " + n + " is " + sum);
    }
}
