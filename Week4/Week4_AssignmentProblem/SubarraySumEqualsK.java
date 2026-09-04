import java.util.HashMap;

public class SubarraySumEqualsK {

    static int subarraySum(int[] nums, int k) {

        // Stores prefix sum and its frequency
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

        // Empty prefix sum
        prefixSumMap.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {

            // Calculate running prefix sum
            currentSum += num;

            // Check if an earlier prefix sum = currentSum - k
            if (prefixSumMap.containsKey(currentSum - k)) {
                count += prefixSumMap.get(currentSum - k);
            }

            // Store/update frequency of current prefix sum
            prefixSumMap.put(
                currentSum,
                prefixSumMap.getOrDefault(currentSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};
        int k = 2;

        int result = subarraySum(nums, k);

        System.out.println(result);
    }
}