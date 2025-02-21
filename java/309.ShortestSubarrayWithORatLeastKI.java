// https://www.youtube.com/watch?v=igIjGxF2J-w
// https://leetcode.com/problems/shortest-subarray-with-or-at-least-k-i/description/?envType=problem-list-v2&envId=2awtivx1

class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int currentOr = 0;

        for (int right = 0; right < n; right++) {
            currentOr |= nums[right]; // Expand the window by including nums[right]

            // Try to shrink the window while it remains valid
            while (left <= right && currentOr >= k) {
                minLength = Math.min(minLength, right - left + 1);
                
                // **Key Trick: Shrinking the window requires removing nums[left]**
                // But we CANNOT just `currentOr ^= nums[left]` as it doesn’t fully revert OR
                // Instead, we move left and recompute OR if necessary
                int tempOr = 0;
                for (int i = left + 1; i <= right; i++) {
                    tempOr |= nums[i];
                }
                currentOr = tempOr;

                left++; // Shrink window from the left
            }
        }

        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
}
