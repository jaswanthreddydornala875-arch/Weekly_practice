import java.util.Scanner;

public class Athelet {
    public static double calculateRounds(double side1, double side2, double side3) {
        double distanceMeters = 5000.0;
        double perimeter = side1 + side2 + side3;
        return distanceMeters / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);
        System.out.printf("Athlete must complete %.2f rounds%n", rounds);
        sc.close();
    }
}