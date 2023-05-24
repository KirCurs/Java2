package num44;
import java.util.Scanner;

public class Main {
    public static String addNumbers(String num1, String num2) {

        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);


        int sum = number1 + number2;


        String result = String.valueOf(sum);


        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String num1 = scanner.nextLine();

        System.out.print("Введите второе число: ");
        String num2 = scanner.nextLine();

        String sum = addNumbers(num1, num2);

        System.out.println("Сумма чисел: " + sum);
    }
}
