package codingbat.warmup;

public class SleepInTask {
    public static void main(String[] args) {
        boolean result1 = sleepIn(false, false);
        boolean result2 = sleepIn(true, false);
        boolean result3 = sleepIn(true, true);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday && vacation) return true;
        else return false;
    }

}
