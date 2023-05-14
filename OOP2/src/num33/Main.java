package num33;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long tanya = 0;
        while (x > 0) {

            if (x % 2 == 1) {
                x--;
                tanya++;
            } else {
                long tanya2 = x / 2;
                long tanya1 = x - 1;
                if (tanya2 > tanya1) {
                    x /= 2;
                } else {
                    x--;
                }
            }
        }
        System.out.println(tanya);
    }
}