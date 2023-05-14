package num27;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int strings = sc.nextInt();          //кол-во строк
        int shift = sc.nextInt();       //сдвиг
        //sc.nextLine();
        char a;

        for (int i = 0; i < (strings + 1); i++) {
            StringBuilder str = new StringBuilder(sc.nextLine());

            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(j) != ' ') {
                    a = (char) (str.charAt(j) - shift);
                    if (a < 'A') a += 26;
                    str.setCharAt(j, a);
                }
            }
            System.out.print(str.toString() + " ");
        }
    }
}

