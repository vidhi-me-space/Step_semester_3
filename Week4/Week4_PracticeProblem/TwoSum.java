import java.util.Arrays;

public class TwoSum {

    static int[] twoSum(int[] nums, int target) {

        // Check every possible pair
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                // Check if the pair adds up to target
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        // No pair found
        return new int[]{};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}