package num42;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int calculateNumberRange(List<int[]> intervals) {
        int count = 0;

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            count += end - start - 1;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<int[]> intervals = new ArrayList<>();

        System.out.print("Введите количество интервалов: ");
        int numIntervals = scanner.nextInt();

        for (int i = 1; i <= numIntervals; i++) {
            System.out.print("Введите начало интервала " + i + ": ");
            int start = scanner.nextInt();

            System.out.print("Введите конец интервала " + i + ": ");
            int end = scanner.nextInt();

            intervals.add(new int[]{start, end});
        }

        int result = calculateNumberRange(intervals);

        System.out.println("Количество чисел между заданными интервалами: " + result);
    }
}
