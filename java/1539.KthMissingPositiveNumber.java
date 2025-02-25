// https://leetcode.com/problems/kth-missing-positive-number/description/?envType=problem-list-v2&envId=2wdd9fdg

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int missingBeforeMid = arr[mid] - (mid + 1);

            if (missingBeforeMid < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return low + k;
    }
}
