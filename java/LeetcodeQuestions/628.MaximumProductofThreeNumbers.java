// https://leetcode.com/problems/maximum-product-of-three-numbers/description/?envType=problem-list-v2&envId=ascyfkj5

class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
        
        // Calculate the maximum product from the two scenarios
        int n = nums.length;
        int maxProduct = Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);
        return maxProduct;
    }
}
