// https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=problem-list-v2&envId=ascyfkj5

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Edge case: if array length is smaller than k (though it's not mentioned in the problem)
        if (nums.length == 0 || k == 0) {
            return 0.0;
        }

        // Compute the sum of the first 'k' elements
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        // Initialize the maximum sum as the sum of the first 'k' elements
        double maxSum = currentSum;

        // Slide the window across the array, updating the sum at each step
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k]; // Add the new element and remove the old one
            maxSum = Math.max(maxSum, currentSum); // Update maxSum if currentSum is greater
        }

        // Return the maximum average
        return maxSum / k;
    }
}
