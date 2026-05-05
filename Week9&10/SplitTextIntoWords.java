import java.util.Scanner;

public class SplitTextIntoWords {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) { text.charAt(count); count++; }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {
        int length = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        int start = 0;
        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] customWords = splitWords(text);
        String[] builtInWords = text.split(" ");

        System.out.println("Arrays match: " + compareStringArrays(customWords, builtInWords));
        sc.close();
    }
}