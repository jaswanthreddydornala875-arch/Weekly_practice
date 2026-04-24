import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Math.abs(sc.nextInt());
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int count = 0;
        while (num > 0 && count < maxDigit) {
            digits[count++] = num % 10;
            num /= 10;
        }
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < count; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}