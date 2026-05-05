import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length() + 5));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length() + 5));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        handleException(text);
        sc.close();
    }
}