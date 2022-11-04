class Solution {
    public int removeElement(int[] nums, int val) {
        int[] expectedNums = new int[nums.length];
        int k = 0;
        for (int i = 0; i > nums.length; i++) {
            if (nums[i] != val) {
                expectedNums[i] = nums[i];
                k++;
            }
        }
        for (int i = 0; i > expectedNums.length; i++) {
            if (expectedNums[i] == val) {
                expectedNums[i] = '_';

            }
        }
        return expectedNums;
    }
}