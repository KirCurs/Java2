package num39;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int nextPermutation(int number) {

        char[] digits = Integer.toString(number).toCharArray();


        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if (i < 0) {
            return -1;
        }


        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }


        swap(digits, i, j);


        Arrays.sort(digits, i + 1, digits.length);


        return Integer.parseInt(new String(digits));
    }

    private static void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int next = nextPermutation(number);
        System.out.println("Следующая перестановка: " + next);
    }
}
