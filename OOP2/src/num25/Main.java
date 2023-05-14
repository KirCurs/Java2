package num25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nums:");
        String userText = sc.nextLine();
        String [] array = userText.split(" ");
        int sum = 0;
        int a;

        for (int i = Integer.parseInt(array[0]); i < Integer.parseInt(array[1]); i++) {
            a = 0;
            for (int j = 2; j < array.length; j++) {
                if (i % Integer.parseInt(array[j]) == 0 ) a++;
            }
            if (a == array.length - 2) sum+=i;
        }
        System.out.println(sum);
    }
}
