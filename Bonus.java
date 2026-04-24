import java.util.*;
public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data=new double[10][2]; 
        double[][] results=new double[10][2]; 
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        for (int i=0;i<10;i++) {
            System.out.print("Enter Salary and Years for Employee " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();

            if (data[i][0] < 0 || data[i][1] < 0) {
                System.out.println("Invalid input. Try again.");
                i--; 
                continue;
            }

            double bonusRate = (data[i][1] > 5) ? 0.05 : 0.02;
            results[i][1] = data[i][0]*bonusRate;
            results[i][0] = data[i][0]+results[i][1];

            totalOld += data[i][0];
            totalBonus += results[i][1];
            totalNew += results[i][0];
        }

        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }
}
