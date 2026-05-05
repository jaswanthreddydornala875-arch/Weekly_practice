import java.util.Scanner;

public class UnitConvertor {
    public static double convertKmToMiles(double km) {
        return km * 0.621371; 
    }
    public static double convertMilesToKm(double miles) { 
        return miles * 1.60934; 
    }
    public static double convertMetersToFeet(double meters) { 
        return meters * 3.28084; 
    }
    public static double convertFeetToMeters(double feet) { 
        return feet * 0.3048; 
    }
    public static double convertYardsToFeet(double yards) { 
        return yards * 3; 
    }
    public static double convertFeetToYards(double feet) { 
        return feet * 0.333333; 
    }
    public static double convertMetersToInches(double meters) { 
        return meters * 39.3701; 
    }
    public static double convertInchesToMeters(double inches) { 
        return inches * 0.0254; 
    }
    public static double convertInchesToCm(double inches) { 
        return inches * 2.54; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter km: ");
        double km = sc.nextDouble();
        System.out.println(km + " km = " + convertKmToMiles(km) + " miles");

        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");

        System.out.print("Enter yards: ");
        double yards = sc.nextDouble();
        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");

        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();
        System.out.println(inches + " inches = " + convertInchesToCm(inches) + " cm");
        sc.close();
    }
}