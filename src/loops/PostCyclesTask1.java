package loops;

import java.util.Scanner;

public class PostCyclesTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            if (number == 51) break;
        } while (number >= 0);

        System.out.println("Программа завершена!");
    }
}
