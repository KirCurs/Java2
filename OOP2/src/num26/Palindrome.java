package num26;

public class Palindrome {
    public static int count = 0;
    public boolean check(String input) {
        String a = "";
        int length = input.length();
        for (int i = 0; i < (length / 2); i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                a = "False";
                continue;
            }
            count += 2;
        }
        if (a.equals("False")) {
            cntPalindrome();
            return false;
        } else {
            cntPalindrome();
            return true;
        }

    }
    public int cntPalindrome() {
        return count;
    }
}
