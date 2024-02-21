package procedures;

import java.util.Scanner;

public class ProcedureWithParams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printDashes(number);
        System.out.println("Закончили печатать дэши");
    }

    static void printDashes(int dashCount) {
        int dashCount2 = 0;
        for (int i = 0; i < dashCount; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void printSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    static void printAverage(int num1, int num2) {
        int sum = num1 + num2;
        int average = sum / 2;
        System.out.println("average: " + average);
    }

}
