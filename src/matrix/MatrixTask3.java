package matrix;

import java.util.Random;

public class MatrixTask3 {
    public static void main(String[] args) {
        Random random = new Random();

        int rowsCount = 4;
        int columnsCount = 4;
        int[][] rgbMatrix = new int[rowsCount][columnsCount];
        double sum = 0;

        for (int i = 0; i < rgbMatrix.length; i++) {
            for (int j = 0; j < rgbMatrix[i].length; j++) {
                rgbMatrix[i][j] = random.nextInt(256);
                sum += rgbMatrix[i][j];
                System.out.print(rgbMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        double averageBrightness = sum / (rowsCount * columnsCount);

        System.out.println();
        System.out.println("Средняя яркость: " + averageBrightness);
        System.out.println();


        int[][] blackAndWhiteMatrix = new int[rowsCount][columnsCount];

        for (int i = 0; i < rgbMatrix.length; i++) {
            for (int j = 0; j < rgbMatrix[i].length; j++) {
                if (rgbMatrix[i][j] < averageBrightness) {
                    blackAndWhiteMatrix[i][j] = 0;
                } else {
                    blackAndWhiteMatrix[i][j] = 255;
                }
                System.out.print(blackAndWhiteMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
