import java.util.Scanner;

public class BMICalculator {
    public static double[][] calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightM = data[i][1] / 100.0;
            data[i][2] = data[i][0] / (heightM * heightM);
        }
        return data;
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) statuses[i] = "Underweight";
            else if (bmi <= 24.9) statuses[i] = "Normal";
            else if (bmi <= 39.9) statuses[i] = "Overweight";
            else statuses[i] = "Obese";
        }
        return statuses;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        calculateBMI(data);
        String[] statuses = getBMIStatus(data);

        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.1f %-10.1f %-10.2f %-15s%n", data[i][0], data[i][1], data[i][2], statuses[i]);
        }
        sc.close();
    }
}