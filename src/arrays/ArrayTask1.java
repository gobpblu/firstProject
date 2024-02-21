package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTask1 {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите минимум: ");
        int min = scanner.nextInt();
        System.out.print("Введите максимум: ");
        int max = scanner.nextInt();

        int size = 100;

        int[] array = new int[100];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
            System.out.println("array[" + i + "] = " + array[i]);
        }

        System.out.println(Arrays.toString(array));

    }
}
