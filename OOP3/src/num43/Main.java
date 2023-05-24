package num43;
import java.util.Scanner;

public class Main {
    public static int getMaxSlideSum(int[][] pyramid) {
        int rows = pyramid.length;


        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {

                int maxSum = Math.max(pyramid[i+1][j], pyramid[i+1][j+1]);

                pyramid[i][j] += maxSum;
            }
        }


        return pyramid[0][0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество уровней пирамиды: ");
        int levels = scanner.nextInt();

        int[][] pyramid = new int[levels][];

        for (int i = 0; i < levels; i++) {
            System.out.print("Введите элементы уровня " + (i+1) + ": ");
            int size = scanner.nextInt();
            pyramid[i] = new int[size];

            for (int j = 0; j < size; j++) {
                pyramid[i][j] = scanner.nextInt();
            }
        }

        int maxSum = getMaxSlideSum(pyramid);

        System.out.println("Максимальная сумма скольжения: " + maxSum);
    }
}
