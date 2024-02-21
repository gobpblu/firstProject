package conditions;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class ConditionTask1 {
    public static void main(String[] args) {

        String str1 = showInputDialog("Введите первое число");
        String str2 = showInputDialog("Введите второе число");

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int num3 = Integer.parseInt(str2);

        boolean isNum1MoreNum2 = num1 < num2 ;

        if (num1 > num2 && num2 > num3) {
            showMessageDialog(null, num1 + " > " + num2);
            showMessageDialog(null, num1 + " > " + num2);
        } else if(num2 > num1 && num2 > num3) {
            showMessageDialog(null, num2 + " > " + num1);
        } else {

        }
    }
}
