package nested_loops;

public class NestedLoopsTask1Solution2 {
    public static void main(String[] args) {
        boolean isSimpleNumber;

        for (int i = 2; i <= 1000; i++) {

            isSimpleNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimpleNumber = false;
                    break;
                }
            }

            if (isSimpleNumber) {
                System.out.println("Простое число: " + i);
            }

        }
    }
}
