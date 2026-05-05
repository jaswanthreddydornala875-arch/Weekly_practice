import java.util.Scanner;

public class CharFrequencyASCII {
    public static String[][] findCharFrequency(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] > 0) {
                boolean seen = false;
                for (int j = 0; j < i; j++) {
                    if (text.charAt(j) == text.charAt(i)) { seen = true; break; }
                }
                if (!seen) count++;
            }
        }

        String[][] result = new String[count][2];
        int idx = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) { seen = true; break; }
            }
            if (!seen) {
                result[idx][0] = String.valueOf(ch);
                result[idx][1] = String.valueOf(frequency[ch]);
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] freq = findCharFrequency(text);
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        for (String[] row : freq) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
        sc.close();
    }
}