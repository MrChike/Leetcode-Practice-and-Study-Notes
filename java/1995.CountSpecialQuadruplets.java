// https://leetcode.com/problems/count-special-quadruplets/description/?envType=problem-list-v2&envId=20w3ezf2

class Solution {
    public int countQuadruplets(int[] nums) {
        // Get the length of the input array
        int n = nums.length;
        
        // Initialize a variable to count the number of valid quadruplets
        int count = 0;
        
        // Start the first loop for the first element of the quadruplet (i)
        for (int i = 0; i < n - 3; i++) {
            // Start the second loop for the second element of the quadruplet (j)
            // Note that j > i, ensuring unique pairs
            for (int j = i + 1; j < n - 2; j++) {
                // Start the third loop for the third element of the quadruplet (k)
                // Note that k > j, ensuring unique pairs
                for (int k = j + 1; k < n - 1; k++) {
                    // Start the fourth loop for the fourth element of the quadruplet (m)
                    // Note that m > k, ensuring unique pairs
                    for (int m = k + 1; m < n; m++) {
                        // Check if the sum of the first three elements equals the fourth element
                        if (nums[i] + nums[j] + nums[k] == nums[m]) {
                            // If condition is true, we've found a valid quadruplet, increment count
                            count++;
                        }
                    }
                }
            }
        }
        
        // Return the total number of valid quadruplets found
        return count;
    }
}
