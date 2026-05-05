import java.util.Scanner;

public class BMICalculatorString {
    public static String[] calculateBMIAndStatus(double weight, double height) {
        double heightM = height / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi <= 18.4) status = "Underweight";
        else if (bmi <= 24.9) status = "Normal";
        else if (bmi <= 39.9) status = "Overweight";
        else status = "Obese";
        return new String[]{String.format("%.2f", bmi), status};
    }

    public static String[][] buildBMITable(double[][] heightWeight) {
        String[][] result = new String[heightWeight.length][4];
        for (int i = 0; i < heightWeight.length; i++) {
            String[] bmiData = calculateBMIAndStatus(heightWeight[i][0], heightWeight[i][1]);
            result[i][0] = String.valueOf(heightWeight[i][0]);
            result[i][1] = String.valueOf(heightWeight[i][1]);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] heightWeight = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            heightWeight[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            heightWeight[i][1] = sc.nextDouble();
        }
        String[][] table = buildBMITable(heightWeight);
        displayTable(table);
        sc.close();
    }
}