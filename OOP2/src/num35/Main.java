package num35;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String text = "";
        System.out.println("Enter step: ");
        int step = sc.nextInt();
        sc.close();
        String separate = File.separator;
        File file;
        file = new File("C:/Users/user/IdeaProjects/OOP2/src/num35/Text");
        Scanner sc2 = new Scanner(file);
        while (sc.hasNextLine()) {
            text += sc.nextLine() + "\n";
        }



    }
}
