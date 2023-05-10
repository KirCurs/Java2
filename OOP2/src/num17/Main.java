package num17;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your Brackets: ");
        String str = sc.nextLine();
        char checksym;
        int open = 0;
        int close = 0;
        for (int i = 0; i < str.length(); i++) {
            checksym = str.charAt(i);
            if (checksym == '(') {
                open++;
            } else {
                close++;
            }
        }
        if (open == close) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
