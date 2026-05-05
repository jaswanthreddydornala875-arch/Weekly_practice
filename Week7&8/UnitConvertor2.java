import java.util.Scanner;

public class UnitConvertor2 {
    public static double convertFahrenheitToCelsius(double fahrenheit) { return (fahrenheit - 32) * 5.0 / 9.0; }
    public static double convertCelsiusToFahrenheit(double celsius) { return (celsius * 9.0 / 5.0) + 32; }
    public static double convertPoundsToKilograms(double pounds) { return pounds * 0.453592; }
    public static double convertKilogramsToPounds(double kilograms) { return kilograms * 2.20462; }
    public static double convertGallonsToLiters(double gallons) { return gallons * 3.78541; }
    public static double convertLitersToGallons(double liters) { return liters * 0.264172; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println(f + "F = " + convertFahrenheitToCelsius(f) + "C");

        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println(c + "C = " + convertCelsiusToFahrenheit(c) + "F");

        System.out.print("Enter pounds: ");
        double pounds = sc.nextDouble();
        System.out.println(pounds + " pounds = " + convertPoundsToKilograms(pounds) + " kg");

        System.out.print("Enter gallons: ");
        double gallons = sc.nextDouble();
        System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");
        sc.close();
    }
}