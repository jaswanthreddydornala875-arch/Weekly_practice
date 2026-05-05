public class RandomArrayStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return new double[]{(double) sum / numbers.length, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.print("Generated numbers: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        double[] stats = findAverageMinMax(arr);
        System.out.printf("Average: %.2f%n", stats[0]);
        System.out.printf("Minimum: %.0f%n", stats[1]);
        System.out.printf("Maximum: %.0f%n", stats[2]);
    }
}