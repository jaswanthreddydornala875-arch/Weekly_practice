import java.util.*;
public class Grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        double[] physics = new double;
        double[] chemistry = new double;
        double[] maths = new double;
        double[] percentages = new double;
        char[] grades = new char;
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            physics[i] = inputMark(sc, "Physics");
            chemistry[i] = inputMark(sc, "Chemistry");
            maths[i] = inputMark(sc, "Maths");
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            grades[i] = calculateGrade(percentages[i]);
        }
        System.out.println("\n----------------- Student Report -----------------");
        System.out.printf("%-10s %-8s %-8s %-8s %-12s %-5s\n", "Student", "Phys", "Chem", "Math", "Percentage", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %-2d: %-8.2f %-8.2f %-8.2f %-12.2f %-5c\n", 
                (i + 1), physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }
        sc.close();
    }
    public static double inputMark(Scanner sc, String subject) {
        double mark;
        while (true) {
            System.out.print("Enter " + subject + " marks: ");
            mark = sc.nextDouble();
            if (mark >= 0 && mark <= 100) break;
            System.out.println("Invalid input. Please enter positive marks (0-100).");
        }
        return mark;
    }
    public static char calculateGrade(double p) {
        if (p >= 80) return 'A';
        if (p >= 70) return 'B';
        if (p >= 60) return 'C';
        if (p >= 50) return 'D';
        if (p >= 40) return 'E';
        return 'R'; 
    }
}