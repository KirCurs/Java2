package num30;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> distances = new ArrayList<>();
        distances.add(50);
        distances.add(55);
        distances.add(57);
        distances.add(58);
        distances.add(60);

        int maxDistance = 175;
        int numCities = 3;


        int maxSum = TripMap.chooseBestSum(maxDistance, numCities, distances);
        System.out.println(maxSum);
    }
}
