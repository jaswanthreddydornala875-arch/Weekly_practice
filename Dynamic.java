import java.util.*;
public class LargeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextLong();
        int maxDigit = 2;
        int[] digits = new int[maxDigit];
        int index = 0;
        while (num > 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = (int)(num % 10);
            num /= 10;
        }
        int first = -1, second = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > first) {
                second = first;
                first = digits[i];
            } else if (digits[i] > second && digits[i] != first) {
                second = digits[i];
            }
        }
        System.out.println("Largest: " + first + ", Second Largest: " + second);
    }
}