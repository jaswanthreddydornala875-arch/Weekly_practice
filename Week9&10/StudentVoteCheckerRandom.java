public class StudentVoteCheckerRandom {
    public static int[] generateRandomAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = (int)(Math.random() * 20) + 10;
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) result[i][1] = "false";
            else result[i][1] = ages[i] >= 18 ? "true" : "false";
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-10s%n", "Age", "Can Vote");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 10;
        int[] ages = generateRandomAges(numberOfStudents);
        String[][] result = checkVotingEligibility(ages);
        displayTable(result);
    }
}