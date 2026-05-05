public class FootballTeamHeights {
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        return heights;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int h : arr) sum += h;
        return sum;
    }

    public static double findMeanHeight(int[] arr) {
        return (double) sumArray(arr) / arr.length;
    }

    public static int findShortestHeight(int[] arr) {
        int min = arr[0];
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    public static int findTallestHeight(int[] arr) {
        int max = arr[0];
        for (int h : arr) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11);
        System.out.print("Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println();
        System.out.printf("Mean Height: %.2f cm%n", findMeanHeight(heights));
        System.out.println("Shortest: " + findShortestHeight(heights) + " cm");
        System.out.println("Tallest: " + findTallestHeight(heights) + " cm");
    }
}