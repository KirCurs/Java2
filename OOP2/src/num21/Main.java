package num21;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nums: ");
        String num = sc.nextLine();
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "7");
        map.put("2", "8");
        map.put("3", "9");
        map.put("7", "1");
        map.put("8", "2");
        map.put("9", "3");
        map.put("4", "4");
        map.put("5", "5");
        map.put("6", "6");
        map.put("0", "0");
        char checkLetter;
        String output = "";
        String CharToStr;
        for (int i = 0; i < num.length(); i++) {
            checkLetter = num.charAt(i);
            CharToStr = Character.toString(checkLetter);
            output += map.get(CharToStr);
        }
        System.out.println(output);
    }
}