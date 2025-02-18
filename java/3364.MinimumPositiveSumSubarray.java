// https://leetcode.com/problems/minimum-positive-sum-subarray/description/?envType=problem-list-v2&envId=2awtivx1

// chatgpt
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;
        boolean found = false;
        
        // For each possible window size L from l to r
        for (int L = l; L <= r; L++) {
            if (L > n) break; // Window size cannot be larger than the array
            
            // Calculate the sum of the first window of size L
            int currentSum = 0;
            for (int i = 0; i < L; i++) {
                currentSum += nums.get(i);
            }
            
            // If the sum is positive, update minSum
            if (currentSum > 0) {
                minSum = Math.min(minSum, currentSum);
                found = true;
            }
            
            // Slide the window over the array
            for (int i = L; i < n; i++) {
                currentSum = currentSum - nums.get(i - L) + nums.get(i);
                if (currentSum > 0) {
                    minSum = Math.min(minSum, currentSum);
                    found = true;
                }
            }
        }
        
        return found ? minSum : -1;
    }
}

// deepseek
// import java.util.List;

// class Solution {
//     public int minimumSumSubarray(List<Integer> nums, int l, int r) {
//         int n = nums.size();
//         int[] prefixSum = new int[n + 1];

//         // Compute prefix sum array
//         for (int i = 0; i < n; i++) {
//             prefixSum[i + 1] = prefixSum[i] + nums.get(i);
//         }

//         int minSum = Integer.MAX_VALUE;

//         // Iterate over all window sizes from l to r
//         for (int windowSize = l; windowSize <= r; windowSize++) {
//             // Slide the window across the array
//             for (int i = 0; i + windowSize <= n; i++) {
//                 int sum = prefixSum[i + windowSize] - prefixSum[i];
//                 if (sum > 0 && sum < minSum) {
//                     minSum = sum;
//                 }
//             }
//         }

//         // If no valid subarray is found, return -1
//         return minSum == Integer.MAX_VALUE ? -1 : minSum;
//     }
// }


// me
// import java.util.Arrays;

// class Solution {
//     public int minimumSumSubarray(List<Integer> nums, int l, int r) {
//         Collections.sort(nums);
//         int numsLength = nums.size();
//         int count = 0;
//         List<Integer> array_list = new ArrayList<>();

//         if (numsLength == 1) {
//             return -1;
//         }

//         for (int c=0; c < numsLength; c++) {
//             if (nums.get(c) < 0) {
//                 array_list.add(nums.get(c));
//             }

//             // if (count >=2) {
//             //     count++
//             // } else {

//             // }
//         }

//         return -1;
//     }
// }

// // default return -1
// // if one item in array return -1
// // Sort the array
// // if there are negative values in nums split the array
//     // if first two are negative just focus on appending only negatives to a list 
//     // between positive and negative because negative values would be the lowest sum
// // Use sliding window to iterate through the range provided
// // sum the range provided if it falls between l, r and sum > 0
// // append to a list 
// // return the lowest sum from the list
