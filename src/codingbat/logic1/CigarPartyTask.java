package codingbat.logic1;

public class CigarPartyTask {
    public static void main(String[] args) {
        boolean isCigarPartySuccessful = cigarParty(100, true);
        System.out.println(isCigarPartySuccessful);
    }

    // На вход приходит количество сигарет и выходной или не выходной
    // Нужно вернуть true если количество сигарет находится в границах
    // От 40 до 60 включительно если это не выходной,
    // или от 40 до бесконечности, если это выходной


    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) return true;
        else if (!isWeekend && cigars >= 40 && cigars <= 60) return true;
        else return false;
    }

    public boolean cigarParty2(int cigars, boolean isWeekend) {
        if (isWeekend) return (cigars >= 40);
        return (cigars >= 40 && cigars <= 60);
    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) return 0;
        else if (date <= 7 && you <= 7) return 1;
        else return 2;
    }
}
