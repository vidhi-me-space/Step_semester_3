public class FindMinimumRotatedArray {

    static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            // Find middle element
            int mid = left + (right - left) / 2;

            // Minimum is in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            // Minimum is in the left half, including mid
            else {
                right = mid;
            }
        }

        // left == right, which is the minimum element
        return nums[left];
    }

    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 1, 2};

        int result = findMin(nums);

        System.out.println(result);
    }
}