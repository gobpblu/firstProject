package functions;

import java.util.Scanner;

public class FunctionExample1 {


    public static void main(String[] args) {
        System.out.print("Введите число: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sum = calculateSumOfDigitsInNumber(number);

        if (sum > 50) {
            System.out.println("Сумма цифр в числе больше 50");
        } else {
            System.out.println("Сумма цифр в числе меньше или равна 50");
        }

    }

    static int calculateSumOfDigitsInNumber(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + (number % 10);
            number /= 10;
        }
        return sum;
    }

    static int calculateSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("Сумма внутри функции:" + sum);
        return sum;
    }

    // 125832895 1 + 2 + 5 + 8 + 3 + 2 + 8 + 9 + 5
}
