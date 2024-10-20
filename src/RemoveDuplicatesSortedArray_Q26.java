public class RemoveDuplicatesSortedArray_Q26 {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {
        int i = 0;

        for (final int num : nums)
            if (i < 1 || num > nums[i - 1])
                nums[i++] = num;

        return i;
    }
}
