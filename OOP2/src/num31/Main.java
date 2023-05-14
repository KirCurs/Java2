package num31;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число из ряда Фибоначчи");
        int num = sc.nextInt();
        Fibonacci fibonacci;
        fibonacci = new Fibonacci(num);
        System.out.println(fibonacci);
    }
}
