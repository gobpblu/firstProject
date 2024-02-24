package functions;

public class FunctionWithVariableLengthParams {
    public static void main(String[] args) {
        calculateSum(1, 2, 3);
        calculateSum(1, 2, 3, 4, 5);
        calculateSum();
        calculateSum(1, 3, 5, 7, 9, 11, 13, 15, 21, 31);
    }

    /*
    На вход приходит разное количество чисел
    Нужно посчитать сумму квадратов всех чисел,
    за исключением четных квадратов
     */

    static void calculateSum(int... nums) {
        int result = 0;
        for (int n : nums) result += n;
        System.out.println("Сумма " + nums.length + " чисел: " + result);
    }


}
