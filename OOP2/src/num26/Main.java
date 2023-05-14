package num26;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String text = sc.nextLine();
        Palindrome palindrome = new Palindrome();
            if (palindrome.check(text)) {
                System.out.println("Данный текс является полиндромом. Наибольшая длина полиндрома составляет " + palindrome.cntPalindrome());
            } else {
                System.out.println("Данный текст не является полиндромом. Наибольшая длина полиндрома составляет " + palindrome.cntPalindrome());
            }
        }
    }

