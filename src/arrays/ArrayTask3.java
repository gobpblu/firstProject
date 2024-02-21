package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTask3 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.print("Массив случайных чисел: ");
        int[] randomNumbers = new int[10];

        double lessThanFiftyCount = 0;
        double lessThanFiftySum = 0;
        double moreOrEqualsFiftyCount = 0;
        double moreOrEqualsFiftySum = 0;

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(101);
            if (randomNumbers[i] < 50) {
                lessThanFiftyCount++;
                lessThanFiftySum += randomNumbers[i];
            } else {
                moreOrEqualsFiftyCount++;
                moreOrEqualsFiftySum += randomNumbers[i];
            }
        }

        System.out.println(Arrays.toString(randomNumbers));

        double lessThanFiftyAverage = lessThanFiftySum / lessThanFiftyCount;
        double moreOrEqualsFiftyAverage = moreOrEqualsFiftySum / moreOrEqualsFiftyCount;

        System.out.printf("Среднее арифметическое элементов [0, 49]: %.2f\n", lessThanFiftyAverage);
        System.out.printf("Среднее арифметическое элементов [50, 100]: %.2f", moreOrEqualsFiftyAverage);
    }
}
