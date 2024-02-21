import java.util.Random;

public class Calculations {
    public static void main(String[] args) {
        int a = 1 / 8;

        System.out.printf("%d \n", a);
        double sin = Math.cos(1.5708);
        System.out.println(sin);

        double pow = Math.pow(4, 3);

        System.out.println("pow = " + pow);


        Random random = new Random();



        int min = 10;
        int max = 20;

        int result = random.nextInt((max - min) + 1) + min;

        System.out.println("Рандомное число между min(" + min + ") и max(" + max + ") = " + result);












//        System.out.printf("%.2f", a);
    }
}
