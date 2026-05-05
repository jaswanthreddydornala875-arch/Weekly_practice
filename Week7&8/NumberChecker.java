import java.util.Scanner;

public class NumberChecker {
    public static int countDigits(int number) {
        int count = 0, temp = Math.abs(number);
        while (temp > 0) { count++; temp /= 10; }
        return count;
    }

    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) if (d != 0) return true;
        return false;
    }

    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigits(number);
        int count = digits.length;
        double sum = 0;
        for (int d : digits) sum += Math.pow(d, count);
        return (int) sum == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) { second = largest; largest = d; }
            else if (d > second) second = d;
        }
        return new int[]{largest, second};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) { second = smallest; smallest = d; }
            else if (d < second) second = d;
        }
        return new int[]{smallest, second};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int[] digits = getDigits(number);

        System.out.println("Digit count: " + countDigits(number));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong: " + isArmstrongNumber(number));

        int[] largestTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);

        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);
        sc.close();
    }
}