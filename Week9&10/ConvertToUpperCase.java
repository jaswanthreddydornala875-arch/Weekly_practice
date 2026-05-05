import java.util.Scanner;

public class ConvertToUpperCase {
    public static String toUpperCase(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            sb.append(ch);
        }
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
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String customUpper = toUpperCase(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("Custom uppercase: " + customUpper);
        System.out.println("Built-in uppercase: " + builtInUpper);
        System.out.println("Both match: " + compareStrings(customUpper, builtInUpper));
        sc.close();
    }
}