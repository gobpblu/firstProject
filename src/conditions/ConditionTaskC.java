package conditions;

import java.util.Scanner;

public class ConditionTaskC {
    public static void main(String[] args) {
        /*
        Задача C
Ввести последовательно возраст Антона, Бориса и Виктора. Определить кто из них старше
Пример:
Возраст Антона: 15
Возраст Бориса: 17
Возраст Виктора: 15
Ответ: Борис старше всех

Пример:
Возраст Антона: 17
Возраст Бориса: 17
Возраст Виктора: 16
Ответ: Антон и Борис старше всех
         */

//        1234567 / 100 = 12345 % 10 = 5;



        int number = 123;

//        if (units == 1 )

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст Антона: ");
        int antonAge = scanner.nextInt();
        System.out.print("Введите возраст Бориса: ");
        int borisAge = scanner.nextInt();
        System.out.print("Введите возраст Виктора: ");
        int victorAge = scanner.nextInt();

        // Victor = 10, Anton = 10, Boris = 7

        if (antonAge > borisAge && antonAge > victorAge) {
            System.out.println("Антон самый старший!");
        } else if (borisAge > antonAge && borisAge > victorAge) {
            System.out.println("Борис самый старший!");
        } else if (victorAge > antonAge && victorAge > borisAge) {
            System.out.println("Виктор самый старший!");
        } else if (borisAge == antonAge && borisAge > victorAge) {
            System.out.println("Борис и Антон старше Виктора!");
        } else if (borisAge == victorAge && borisAge > antonAge) {
            System.out.println("Борис и Виктор старше Антона!");
        } else if (victorAge > borisAge) {
            System.out.println("Антон и Виктор старше Бориса");
        } else {
            System.out.println("Все одного возраста!");
        }

    }
}
