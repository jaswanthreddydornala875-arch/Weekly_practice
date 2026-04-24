import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numStr = sc.next();
        int count = numStr.length();
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        int[] frequency = new int[10];
        for (int i = 0; i < digits.length; i++) {
            int digitValue = digits[i];
            frequency[digitValue]++;
        }
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }
        sc.close();
    }
}