// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/?envType=problem-list-v2&envId=2wdd9fdg

class Solution {
    public int maximumCount(int[] nums) {
        int firstNonNegative = findFirst(nums, 0);
        int firstPositive = findFirst(nums, 1);
        
        int negCount = firstNonNegative;
        int posCount = nums.length - firstPositive;
        
        return Math.max(negCount, posCount);
    }
    
    // Generalized function to find first element based on a condition.
    private int findFirst(int[] nums, int type) {
        int low = 0, high = nums.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (type == 0) {  // Find first non-negative (nums[mid] >= 0)
                if (nums[mid] < 0) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            } else {  // Find first positive (nums[mid] > 0)
                if (nums[mid] <= 0) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
        }
        return low;
    }
}


// My Solution
// class Solution {
//     public int maximumCount(int[] nums) {
//         ArrayList arr0 = new ArrayList(), arr1 = new ArrayList();

//         for (int c = 0; c < nums.length; c++) {
//             if (nums[c] < 0) {
//                 arr0.add(nums[c]);
//             } else if (nums[c] == 0) {
//                 continue;
//             } else {
//                 arr1.add(nums[c]);
//             }
//         }

//         return Math.max(arr0.size(), arr1.size());
//     }
// }

// First, my edge case
// Create 2 arrays that house positive & negative integers.
// Use Binary Search
// Loop Through the array and store negative/positive values in the right array
// return the maximum length between one of the array.
