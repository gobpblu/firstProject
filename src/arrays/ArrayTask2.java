package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTask2 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.print("Массив случайных чисел: ");
        int[] randomNumbers = new int[10];
        double sum = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(101);
            sum += randomNumbers[i];
        }

        System.out.println(Arrays.toString(randomNumbers));

        double average = sum / randomNumbers.length;

        System.out.printf("Среднее арифметическое значений массива: %.2f", average);
    }
}
