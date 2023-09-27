package problems.arrays.easy;
/*
27. Remove Element
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int validArraySize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[validArraySize++] = nums[i];
            }
        }
        return validArraySize;
    }
}
