package num34;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of visitor:");
        String input = sc.nextLine();
        String[] weights = input.split(" ");
        Arrays.sort(weights, (a, b) -> {
            int sumA = sumDigits(a);
            int sumB = sumDigits(b);
            if (sumA == sumB) {
                return Integer.compare(Integer.parseInt(b), Integer.parseInt(a));
            }
            return Integer.compare(sumB, sumA);
        });
        System.out.println("Sorted list: ");
        for (String weight : weights) {
            System.out.print(weight + " ");
        }
    }
    private static int sumDigits(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            count += Character.getNumericValue(c);
        }
        return count;
    }
}