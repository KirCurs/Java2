package num29;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int xInt = Integer.parseInt(x.trim());
        int y = sc.nextInt() - 1;
        int count = 0;
        String[] Array = x.split("");
        for(int i = 0; i < Array.length; i++){
            y++;
            int n = Integer.parseInt(Array[i].trim ());
            count += Math.pow(n,y);
        }
        if(count % xInt == 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
