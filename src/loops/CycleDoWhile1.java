package loops;

import java.util.Scanner;

public class CycleDoWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        int number = scanner.nextInt();

        int lastDigit = number % 10;
        int preLastDigit = 0;
        boolean hasNearNumbers = false;
        do {
            number = number / 10;
            if (number > 0) {
                preLastDigit = number % 10;
                System.out.println("prelast" + preLastDigit +", last" + lastDigit);
                if (lastDigit == preLastDigit) {
                    hasNearNumbers = true;
                    break;
                }
                lastDigit = preLastDigit;
            }
        } while (number > 0);

        String result = hasNearNumbers ? "Да" : "Нет";
        System.out.println("Есть одинаковые цифры рядом: " + result);
    }
}
