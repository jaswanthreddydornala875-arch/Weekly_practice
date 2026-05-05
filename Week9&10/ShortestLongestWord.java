import java.util.Scanner;

public class ShortestLongestWord {
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
        int wordIndex = 0, start = 0;
        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestAndLongest(String[][] wordsWithLengths) {
        int shortestIdx = 0, longestIdx = 0;
        for (int i = 1; i < wordsWithLengths.length; i++) {
            int len = Integer.parseInt(wordsWithLengths[i][1]);
            if (len < Integer.parseInt(wordsWithLengths[shortestIdx][1])) shortestIdx = i;
            if (len > Integer.parseInt(wordsWithLengths[longestIdx][1])) longestIdx = i;
        }
        return new int[]{shortestIdx, longestIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        int[] indexes = findShortestAndLongest(wordsWithLengths);

        System.out.println("Shortest word: " + wordsWithLengths[indexes[0]][0]);
        System.out.println("Longest word: " + wordsWithLengths[indexes[1]][0]);
        sc.close();
    }
}