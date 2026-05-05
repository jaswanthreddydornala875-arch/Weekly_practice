import java.util.Scanner;

public class CharFrequencyNestedLoop {
    public static String[] findCharFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        int uniqueCount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
            uniqueCount++;
        }

        String[] result = new String[uniqueCount];
        int idx = 0;
        char[] original = text.toCharArray();
        for (int i = 0; i < original.length; i++) {
            if (freq[i] > 0) {
                result[idx++] = original[i] + ":" + freq[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] freq = findCharFrequency(text);
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        for (String entry : freq) {
            String[] parts = entry.split(":");
            System.out.printf("%-10s %-10s%n", parts[0], parts[1]);
        }
        sc.close();
    }
}