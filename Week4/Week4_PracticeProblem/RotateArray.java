import java.util.Arrays;

public class RotateArray {

    static int[] rotateArray(int[] nums, int k) {

        // Reduce k to avoid unnecessary rotations
        k = k % nums.length;

        // Create a new array
        int[] newArray = new int[nums.length];

        // Calculate the new position of every element
        for (int i = 0; i < nums.length; i++) {

            newArray[(i + k) % nums.length] = nums[i];
        }

        // Copy values back into nums
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newArray[i];
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int[] result = rotateArray(nums, k);

        System.out.println(Arrays.toString(result));
    }
}