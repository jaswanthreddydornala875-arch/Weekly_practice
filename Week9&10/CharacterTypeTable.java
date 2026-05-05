import java.util.Scanner;

public class CharacterTypeTable {
    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
        else if (ch >= 'a' && ch <= 'z') return "Consonant";
        else return "Not a Letter";
    }

    public static String[][] getCharacterTypes(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharType(text.charAt(i));
        }
        return result;
    }

    public static void display2DArray(String[][] data) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] charTypes = getCharacterTypes(text);
        display2DArray(charTypes);
        sc.close();
    }
}