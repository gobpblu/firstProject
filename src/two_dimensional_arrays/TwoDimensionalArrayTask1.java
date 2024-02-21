package two_dimensional_arrays;

import java.util.Random;

public class TwoDimensionalArrayTask1 {
    public static void main(String[] args) {
        int N = 100, M = 100;
        int[][] numbers = new int[N][M];
        double[][] X = new double[1][2];
        boolean[][] L = new boolean[1][3];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                numbers[i][j] = random.nextInt(10);
                sum = sum + numbers[i][j];
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Сумма всех чисел: " + sum);
    }
}
