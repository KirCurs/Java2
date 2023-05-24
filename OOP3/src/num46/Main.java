package num46;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static int convertToArabic(String romanNumber) {

        Map<Character, Integer> romanSymbols = new HashMap<>();
        romanSymbols.put('I', 1);
        romanSymbols.put('V', 5);
        romanSymbols.put('X', 10);
        romanSymbols.put('L', 50);
        romanSymbols.put('C', 100);
        romanSymbols.put('D', 500);
        romanSymbols.put('M', 1000);

        int arabicNumber = 0;
        int prevValue = 0;


        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            char currentSymbol = romanNumber.charAt(i);

            // Получаем значение текущего символа
            int currentValue = romanSymbols.get(currentSymbol);

            // Если текущее значение меньше предыдущего, вычитаем его
            if (currentValue < prevValue) {
                arabicNumber -= currentValue;
            }
            // Иначе прибавляем его
            else {
                arabicNumber += currentValue;
                prevValue = currentValue;
            }
        }

        // Возвращаем арабское число
        return arabicNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите римское число (от I до MMMCMXCIX): ");
        String romanNumber = scanner.nextLine();

        int arabicNumber = convertToArabic(romanNumber);
        System.out.println("Арабское число: " + arabicNumber);
    }
}
