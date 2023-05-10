package num23;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num: ");
        int n = sc.nextInt();
        System.out.println("Enter first end second div: ");
        int firstDiv = sc.nextInt();
        int secondDiv = sc.nextInt();
        int checkFirst = 0;
        int checkSecond = 0;
        for (int i = 1; i <= n; i++ ){
            if (i % firstDiv == 0){
                checkFirst += 1;
            }
        }
        for(int i = 1; i <= n; i++){
            if (i % secondDiv == 0){
                checkSecond += 1;
            }
        }
        System.out.println("Sum div - " + (checkFirst + checkSecond ));
    }

}
