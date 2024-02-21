package nested_loops;

public class NestedLoopsTask1 {
    public static void main(String[] args) {
        int[] simpleNumbers = new int[999];
        String result = "";
        boolean isSimpleNumbers = true;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                    if(i % j == 0) {
                        isSimpleNumbers = false;
                        break;
                }
            }
            if (isSimpleNumbers){
                simpleNumbers[i-2] = i;
                result += " " + simpleNumbers[i-2] + ",";
            }
            else isSimpleNumbers = true;
        }
        System.out.println("MEGAULTRASUPERPUPERDUPERKRUTOY ARRAAAAAAY IS HEREEEEEEE ==== [" + result.substring(1,result.length()-1) + ']');

    }
}
