package num47;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> snail(int[][] array) {
        List<Integer> result = new ArrayList<>();

        if (array == null || array.length == 0) {
            return result;
        }

        int topRow = 0;
        int bottomRow = array.length - 1;
        int leftCol = 0;
        int rightCol = array[0].length - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Вправо
            for (int col = leftCol; col <= rightCol; col++) {
                result.add(array[topRow][col]);
            }
            topRow++;

            // Вниз
            for (int row = topRow; row <= bottomRow; row++) {
                result.add(array[row][rightCol]);
            }
            rightCol--;

            // Влево
            if (topRow <= bottomRow) {
                for (int col = rightCol; col >= leftCol; col--) {
                    result.add(array[bottomRow][col]);
                }
                bottomRow--;
            }

            // Вверх
            if (leftCol <= rightCol) {
                for (int row = bottomRow; row >= topRow; row--) {
                    result.add(array[row][leftCol]);
                }
                leftCol++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();

        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        List<Integer> snailSorted = snail(array);
        System.out.println("Отсортированный массив по змейке: " + snailSorted);
    }
}
