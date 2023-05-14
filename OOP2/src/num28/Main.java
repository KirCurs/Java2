package num28;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Integer> Squares = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        double num = sc.nextInt();
        if (num < 0 || num > 10000) {
            System.out.println("Input error");
        } else {
            for (int i = 1; i < num; i++) {
                Squares.add((int) Math.pow(i, 2));
            }
        }
        System.out.println(getRes(num));
    }

    public static String getRes(double num) {
        for (int i = 0; i < Squares.size(); i++) {
            for (int j = 0; j < Squares.size(); j++) {
                if (Squares.get(i) - Squares.get(j) == num) {
                    return ((int) num + " = " + Squares.get(i) + " - " + Squares.get(j));
                }
            }
        }
        return ("No values found");
    }
}