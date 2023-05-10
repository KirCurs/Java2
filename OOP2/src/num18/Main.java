package num18;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static final int[] allNum = new int[10];
    public static final ArrayList<Integer> leftArray = new ArrayList<>();
    public static final ArrayList<Integer> rightArray = new ArrayList<>();
    private static final int DOWN = 0;
    private static final int UP = 100;
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            allNum[i] = DOWN + (int) (Math.random() * UP);
        }
        int max = allNum[0];
        int index = 0;
        for (int i = 1; i < allNum.length; i++) {
            if (allNum[i] > max) {
                max = allNum[i];
                index = i;
            }
        }
        for (int i = 0; i < index; i++) {
            leftArray.add(allNum[i]);
        }
        for (int i = index + 1; i < allNum.length ; i++) {
            rightArray.add(allNum[i]);
        }
        System.out.println("Исходный массив " + Arrays.toString(allNum) + "\n" + "Левый массив " + leftArray + "\n" + "Правый массив " + rightArray);
    }
}