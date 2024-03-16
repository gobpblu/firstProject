package classesAndObjects;

public class CockExample1 {
    public static void main(String[] args) {
        Cock cock1 = new Cock();
        cock1.age = 5;
        cock1.isAlive = false;
        cock1.weight = 3.4;
        System.out.println("ПЕТУХ 1: " +
                "возраст: " + cock1.age +
                ", живой: " + cock1.isAlive +
                ", вес: " + cock1.weight);

        Cock cock2 = new Cock();
        cock2.age = 3;
        cock2.isAlive = true;
        cock2.weight = 2;
        System.out.println("ПЕТУХ 2: " +
                "возраст: " + cock2.age +
                ", живой: " + cock2.isAlive +
                ", вес: " + cock2.weight);

        Cock cock3 = new Cock();
        cock3.age = 3;
        cock3.isAlive = true;
        cock3.weight = 2;
        System.out.println("ПЕТУХ 3: " +
                "возраст: " + cock3.age +
                ", живой: " + cock3.isAlive +
                ", вес: " + cock3.weight);
    }
}
