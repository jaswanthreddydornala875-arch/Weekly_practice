import java.util.Scanner;

public class TrimSpaces {
    public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String createSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) sb.append(text.charAt(i));
        return sb.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String customTrimmed = createSubstring(text, indexes[0], indexes[1]);
        String builtInTrimmed = text.trim();

        System.out.println("Custom trimmed: '" + customTrimmed + "'");
        System.out.println("Built-in trimmed: '" + builtInTrimmed + "'");
        System.out.println("Both match: " + compareStrings(customTrimmed, builtInTrimmed));
        sc.close();
    }
}