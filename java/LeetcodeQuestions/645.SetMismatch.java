// https://leetcode.com/problems/set-mismatch/description/?envType=problem-list-v2&envId=ascyfkj5

import java.util.Arrays;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] return_array = new int[2];  // Array to store the duplicate and missing number
        
        // Step 1: Detect the duplicate using a set or by modifying the array
        // Step 2: Calculate the missing number
        int sum = 0;           // Sum of numbers seen
        int expectedSum = 0;   // Expected sum if all numbers were unique
        int n = nums.length;
        boolean[] seen = new boolean[n + 1]; // Track seen numbers (1-based index)
        
        for (int i = 0; i < n; i++) {
            sum += nums[i]; // Calculate actual sum
            expectedSum += (i + 1); // Calculate expected sum from 1 to n
            
            if (seen[nums[i]]) {
                return_array[0] = nums[i]; // Duplicate found
            }
            seen[nums[i]] = true; // Mark number as seen
        }

        // Missing number = (Expected Sum) - (Actual Sum - Duplicate)
        return_array[1] = expectedSum - (sum - return_array[0]);
        
        return return_array; // Return both the duplicate and the missing number
    }
}
