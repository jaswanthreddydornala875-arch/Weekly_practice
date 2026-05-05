import java.util.Scanner;

public class UniqueCharacters {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) { text.charAt(count); count++; }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) temp[uniqueCount++] = ch;
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = findUniqueCharacters(text);
        System.out.print("Unique characters: ");
        for (char ch : unique) System.out.print(ch + " ");
        System.out.println();
        sc.close();
    }
}