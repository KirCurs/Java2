package num38;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 1) {
                char firstLetter = word.charAt(0);
                String modifiedWord = word.substring(1) + firstLetter + "ауч ";
                result.append(modifiedWord);
            } else {
                result.append(word).append("ауч ");
            }
        }
        System.out.println("Result text");
        System.out.println(result.toString().trim());
    }
}
