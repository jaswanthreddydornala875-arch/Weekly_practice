import java.util.Scanner;

public class NumberChecker5 {
    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) if (number % i == 0) sum += i;
        return sum;
    }

    public static boolean isPerfectNumber(int number) { return sumOfProperDivisors(number) == number; }
    public static boolean isAbundantNumber(int number) { return sumOfProperDivisors(number) > number; }
    public static boolean isDeficientNumber(int number) { return sumOfProperDivisors(number) < number; }

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.println("Is Perfect: " + isPerfectNumber(number));
        System.out.println("Is Abundant: " + isAbundantNumber(number));
        System.out.println("Is Deficient: " + isDeficientNumber(number));
        System.out.println("Is Strong: " + isStrongNumber(number));
        sc.close();
    }
}