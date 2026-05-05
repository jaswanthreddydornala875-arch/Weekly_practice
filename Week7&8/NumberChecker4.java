import java.util.Scanner;

public class NumberChecker4 {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) if (number % i == 0) return false;
        return true;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) { sum += number % 10; number /= 10; }
        return sum;
    }

    public static boolean isNeonNumber(int number) {
        int square = number * number;
        return sumOfDigits(square) == number;
    }

    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1, temp = number;
        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            product *= d;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.println("Is Prime: " + isPrime(number));
        System.out.println("Is Neon: " + isNeonNumber(number));
        System.out.println("Is Spy: " + isSpyNumber(number));
        System.out.println("Is Automorphic: " + isAutomorphicNumber(number));
        System.out.println("Is Buzz: " + isBuzzNumber(number));
        sc.close();
    }
}