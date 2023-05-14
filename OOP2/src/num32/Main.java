package num32;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int mov = 0;
        while (x > 0) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x--;
            }
            mov++;
        }
        if (mov % 2 == 0) {
            System.out.println("Таня");
        } else {
            System.out.println("Саша");
        }
    }
}

