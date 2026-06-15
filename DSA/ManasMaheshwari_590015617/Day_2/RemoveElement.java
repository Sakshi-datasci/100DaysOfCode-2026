class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the next valid position
        
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not the value to remove
            if (nums[i] != val) {
                nums[k] = nums[i]; // Place it at the valid position
                k++; // Increment the valid position pointer
            }
        }
        
        return k; // Return the number of elements not equal to val
    }
}
