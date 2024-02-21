package loops;

import java.util.Scanner;

public class CycleTaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int result = 0;

        boolean isNegative = num1 < 0 && num2 >= 0 || num1 >= 0 && num2 < 0;

        int absNum1 = Math.abs(num1);
        int absNum2 = Math.abs(num2);

        while (absNum1 > 0) {
            result = result + absNum2;
            absNum1--;
        }

        int finalResult = isNegative ? -result : result;

        System.out.println(num1 + " * (" + num2 + ") = " + finalResult);
    }
}
