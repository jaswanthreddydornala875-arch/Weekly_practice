import java.util.Scanner;

public class NumberAnalyzer {
    public static boolean isPositive(int number) { return number >= 0; }
    public static boolean isEven(int number) { return number % 2 == 0; }
    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        if (number1 == number2) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is Positive and ");
                System.out.println(isEven(numbers[i]) ? "Even" : "Odd");
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result == 1) System.out.println("First element is greater than last");
        else if (result == 0) System.out.println("First and last elements are equal");
        else System.out.println("First element is less than last");
        sc.close();
    }
}