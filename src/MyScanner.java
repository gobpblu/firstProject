import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String a = myScanner.nextLine();
        int b = myScanner.nextInt();

        System.out.println(a);

        System.out.println("I wrote " + b);

        String sum = a + b;

        System.out.println("Summa = " + sum);
    }
}
