package num41;
import java.util.Scanner;

public class Main {
    public static String calculateTime(int seconds) {
        int[] durations = {365 * 24 * 60 * 60, 30 * 24 * 60 * 60, 7 * 24 * 60 * 60, 24 * 60 * 60, 60 * 60, 60, 1};
        String[] labels = {"год", "месяц", "неделя", "день", "час", "минута", "секунда"};

        StringBuilder result = new StringBuilder();
        boolean isPreviousIncluded = false;

        for (int i = 0; i < durations.length; i++) {
            int duration = durations[i];
            String label = labels[i];

            if (seconds >= duration) {
                int count = seconds / duration;
                seconds %= duration;

                if (isPreviousIncluded) {
                    result.append(", ");
                }

                if (count > 1) {
                    result.append(count).append(" ").append(label).append("и");
                } else {
                    result.append(count).append(" ").append(label);
                }

                isPreviousIncluded = true;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество секунд: ");
        int seconds = scanner.nextInt();

        String result = calculateTime(seconds);

        System.out.println(result);
    }
}
