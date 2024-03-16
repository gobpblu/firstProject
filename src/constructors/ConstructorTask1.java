package constructors;

public class ConstructorTask1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(11, 10);

        rectangle.setWidth(50);
        System.out.println("Height: " + rectangle.getHeight() + ", width: " + rectangle.getWidth());
    }
}
