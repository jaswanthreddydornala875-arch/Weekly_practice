public class StudentScorecard {
    public static int[][] generateScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10;
            scores[i][1] = (int)(Math.random() * 90) + 10;
            scores[i][2] = (int)(Math.random() * 90) + 10;
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = Math.round((double) total / 3 * 100.0) / 100.0;
            double percentage = Math.round((double) total / 300 * 100 * 100.0) / 100.0;
            stats[i][0] = total;
            stats[i][1] = average;
            stats[i][2] = percentage;
        }
        return stats;
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    public static void displayScorecard(int[][] scores, double[][] stats) {
        System.out.printf("%-5s %-8s %-8s %-8s %-8s %-8s %-10s %-6s%n",
            "No", "Physics", "Chem", "Math", "Total", "Avg", "Percent", "Grade");
        for (int i = 0; i < scores.length; i++) {
            String grade = calculateGrade(stats[i][2]);
            System.out.printf("%-5d %-8d %-8d %-8d %-8.0f %-8.2f %-10.2f %-6s%n",
                i + 1, scores[i][0], scores[i][1], scores[i][2],
                stats[i][0], stats[i][1], stats[i][2], grade);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 5;
        int[][] scores = generateScores(numberOfStudents);
        double[][] stats = calculateStats(scores);
        displayScorecard(scores, stats);
    }
}