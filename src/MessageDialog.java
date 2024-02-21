import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class MessageDialog {
    public static void main(String[] args) {
        String text = showInputDialog("Введите целое число: ");
        int number = Integer.parseInt(text);
        int number2 = number + 100;
        System.out.println(number2);

        String text2 = showInputDialog("Введите дробное число: ");
        double number3 = Double.parseDouble(text2);
        double number4 = 1.5 + number3;
        System.out.println("Мое дробное число: " + number4);

        int sumNumAndNum2 = number + number2;
        double sumNum3AndNum4 = number3 + number4;

        String result = "Число 1: " + number + "\n"
                + "Число 2: " + number2 + "\n"
                + "Число 3: " + number3 + "\n"
                + "Число 4: " + number4 + "\n"
                + number + " + " + number2 + " = " + sumNumAndNum2 + "\n"
                + number3 + " + " + number4 + " = " + sumNum3AndNum4;

        showMessageDialog(null, result);
    }
}
