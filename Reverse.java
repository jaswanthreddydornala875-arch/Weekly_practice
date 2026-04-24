import java.util.*;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int count = input.length();
        int[] digits = new int[count];
        long n = Long.parseLong(input);
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(n % 10);
            n /= 10;
        }
        System.out.print("Digits in reverse order: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
    }
}