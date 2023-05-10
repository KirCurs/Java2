package num20;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту");
        int rows = sc.nextInt();
        System.out.println("Введите ширину");
        int cols = sc.nextInt();
        Matrix matrix = new Matrix(rows, cols);
        matrix.filingRing();
        System.out.println(matrix);
    }
}
