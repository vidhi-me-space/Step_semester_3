public class ContainsDuplicate {

    static boolean containsDuplicate(int[] nums) {

        // Compare every pair of elements
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                // Check for duplicate
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        // No duplicate found
        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        boolean result = containsDuplicate(nums);

        System.out.println(result);
    }
}