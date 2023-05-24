package num45;
import java.util.Scanner;

public class Main {
    public static String convertToRoman(int number) {

        String[] romanSymbols = {
                "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };
        int[] arabicValues = {
                1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };

        StringBuilder romanNumber = new StringBuilder();
        int i = 0;


        while (number > 0) {
            if (number >= arabicValues[i]) {
                romanNumber.append(romanSymbols[i]);
                number -= arabicValues[i];
            } else {
                i++;
            }
        }


        return romanNumber.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество лет (от 1 до 9999): ");
        int years = scanner.nextInt();

        if (years < 1 || years > 9999) {
            System.out.println("Недопустимое количество лет!");
        } else {
            String romanNumber = convertToRoman(years);
            System.out.println("Римское число: " + romanNumber);
        }
    }
}
