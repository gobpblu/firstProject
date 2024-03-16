package settersAndGetters;

import java.util.Scanner;

public class RectangleTask1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 10.3;
        rectangle.length = 30;
        System.out.println("Площадь прямоугольника с шириной: " + rectangle.getWidth() +
                " и длиной " + rectangle.getLength() + " равна " + rectangle.getSquare());
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setWidth(a);
        rectangle2.setLength(2);
        System.out.println("Площадь прямоугольника с шириной: " + rectangle2.getWidth() +
                " и длиной " + rectangle2.getLength() + " равна " + rectangle2.getSquare());
    }
}
