package num40;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static List<String> formatRanges(int[] numbers) {
        List<String> ranges = new ArrayList<>();

        int start = numbers[0];
        int prev = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == prev + 1) {
                prev = numbers[i];
            } else {
                ranges.add(getRange(start, prev));
                start = numbers[i];
                prev = numbers[i];
            }
        }

        ranges.add(getRange(start, prev));

        return ranges;
    }

    private static String getRange(int start, int end) {
        if (start == end) {
            return Integer.toString(start);
        } else {
            return start + "-" + end;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числа (через пробел): ");
        String input = scanner.nextLine();

        String[] numbersStr = input.split(" ");
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }

        List<String> ranges = formatRanges(numbers);

        System.out.println("Диапазоны:");
        for (String range : ranges) {
            System.out.println(range);
        }
    }
}
