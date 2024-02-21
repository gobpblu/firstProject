package conditions;

import java.util.Scanner;

public class ConditionTaskFAges {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int units = number % 10;

        int decimals = number / 10 % 10;

        int hundreds = number / 100 % 10;

        String result;

        System.out.println("units: " + units);
        System.out.println("decimals: " + decimals);

//        switch(operation) {
//            case "+":
//                result = num1 + num2;
//        }

        if (decimals != 1 && units > 1 && units <= 4) {
            result = "года";
        } else if (units == 1) {
            result = "год";
        } else {
            result = "лет";
        }

        System.out.println("Вам " + number + " " + result);

        System.out.println();
    }
}
