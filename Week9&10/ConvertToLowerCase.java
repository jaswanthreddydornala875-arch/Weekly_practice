import java.util.Scanner;

public class ConvertToLowerCase {
    public static String toLowerCase(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
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

        String customLower = toLowerCase(text);
        String builtInLower = text.toLowerCase();

        System.out.println("Custom lowercase: " + customLower);
        System.out.println("Built-in lowercase: " + builtInLower);
        System.out.println("Both match: " + compareStrings(customLower, builtInLower));
        sc.close();
    }
}