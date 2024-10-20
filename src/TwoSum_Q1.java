import java.util.Arrays;

public class TwoSum_Q1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 5, 6};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int index = 0;
            while (index < nums.length) {
                if (index != i) {
                    if (nums[i] + nums[index] == target) {
                        return new int[]{i, index};
                    }
                }
                index++;
            }
        }
        return null;
    }
}

