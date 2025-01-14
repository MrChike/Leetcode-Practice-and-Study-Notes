// https://leetcode.com/problems/next-permutation/description/?envType=problem-list-v2&envId=ascyfkj5

class Solution {
    public void nextPermutation(int[] nums) {
        // Step 1: Find the largest index i such that nums[i] < nums[i + 1]
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        // If such index i exists (meaning the array is not in descending order)
        if (i >= 0) {
            // Step 2: Find the largest index j such that nums[j] > nums[i]
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            
            // Step 3: Swap the elements at indices i and j
            swap(nums, i, j);
        }
        
        // Step 4: Reverse the subarray from i + 1 to the end of the array
        reverse(nums, i + 1);
    }
    
    // Helper function to swap elements at indices i and j
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    // Helper function to reverse the subarray starting at index start
    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
