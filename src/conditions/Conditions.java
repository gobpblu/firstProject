package conditions;

public class Conditions {
    public static void main(String[] args) {
        boolean isEquals = 5 == 3;
        boolean isMore = 5 > 6;
        boolean isLess = 5 < 6;
        boolean isLessOrEqual = 5 <= 2;
        boolean isMoreOrEqual = 5 >= 2;
        boolean isNotEqual = 7 != 8;

        System.out.println("5 is less than 6 is " + isLess);
        System.out.println(isEquals + "  " + isMore + " " + isLessOrEqual + " " + isNotEqual);
        System.out.println(isMoreOrEqual);


    }
}
