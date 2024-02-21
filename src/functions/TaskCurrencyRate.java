package functions;

import javax.swing.*;

import java.util.Arrays;

import static javax.swing.JOptionPane.*;

public class TaskCurrencyRate {

    public static void main(String[] args) {
        System.out.println("args: " + Arrays.toString(args));
        String currency = showInputDialog("Input your currency (USD, RUB, EUR, CNY)");
        System.out.println("currency: " + currency);
        double currencyRate = getCurrentCurrencyRate(currency);
        System.out.println("currencyRate: " + currencyRate);
        showMessageDialog(
                null,
                "Exchange rate to som: " + currencyRate,
                "EXCHANGE RATE",
                WARNING_MESSAGE
        );
        int result = showConfirmDialog(null, "Согласны ли вы?");
        System.out.println(result);
    }

    static double getCurrentCurrencyRate(String currency) {
        currency = "jgifsjgi";
        double rate;
        String currencyUppercase = currency.toUpperCase();
//        System.out.println(currencyUppercase);
        switch (currencyUppercase) {
            case "USD":
                rate = 89.32;
                return rate;
            case "RUB":
                rate = 0.98;
                return rate;
            case "EUR":
                rate = 97.17;
                return rate;
            case "CNY":
                rate = 12.58;
                return rate;
            default:
                throw new Error("You wrote incorrect currency");
        }
    }
}
