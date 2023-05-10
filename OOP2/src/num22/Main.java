package num22;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 side: ");
        int aSide = sc.nextInt();
        int bSide = sc.nextInt();
        int cSide = sc.nextInt();
        if (aSide + bSide < cSide || aSide + cSide < bSide || bSide + cSide < aSide) {
            System.out.println("Its impossible triangle");
            System.exit(0);
        }

        double p1 = (aSide + bSide + cSide) / 2.0;
        System.out.println("Area:" + Math.sqrt(p1 * (p1 - aSide) * (p1 - bSide) * (p1 - cSide)));
    }
    }

