package procedures;

import java.util.Scanner;

public class ProcedureTask1 {

    public static void main(String[] args) {
        printMultiplicationTable();
    }

    static void printMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {

            for (int count = 1; count <= 10; count++) {
                int result = count * number;
                System.out.println(number + " * " + count + " = " + result);
            }
        } else {
            showError();
        }
    }
    static void showError() {
        System.out.println("Ошибка программы");
    }

}
