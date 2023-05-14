package num30;
import java.util.ArrayList;
import java.util.Collection;
public class TripMap {
    public static int chooseBestSum(int maxDistance, int numCities, ArrayList<Integer> distances) {
        int maxSum = -1;

        // Создаем список из индексов городов
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < distances.size(); i++) {
            indices.add(i);
        }

        // Генерируем все возможные комбинации из numCities городов
        ArrayList<ArrayList<Integer>> combinations = new ArrayList<>();
        generateCombinations(combinations, indices, new ArrayList<Integer>(), numCities, 0);

        // Проходимся по каждой комбинации и считаем сумму расстояний
        for (ArrayList<Integer> combination : combinations) {
            int sum = 0;
            for (int index : combination) {
                sum += distances.get(index);
            }
            if (sum <= maxDistance && sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    // Рекурсивный метод для генерации комбинаций
    private static void generateCombinations(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> indices, ArrayList<Integer> currentCombination, int size, int startIndex) {
        if (currentCombination.size() == size) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = startIndex; i < indices.size(); i++) {
            currentCombination.add(indices.get(i));
            generateCombinations(result, indices, currentCombination, size, i + 1);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
