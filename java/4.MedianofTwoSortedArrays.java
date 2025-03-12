// https://leetcode.com/problems/median-of-two-sorted-arrays/description/?envType=problem-list-v2&envId=ascyfkj5

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int m = nums1.length;
        int n = nums2.length;
        int left = 0, right = m;
        int halfLen = (m + n + 1) / 2; // Total elements in the left partition

        while (left <= right) {
            int partition1 = (left + right) / 2; // Partition in nums1
            int partition2 = halfLen - partition1; // Corresponding partition in nums2

            // Handle edge cases where partitions are out of bounds
            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];

            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];

            // Check if the partition is correct
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // Found the correct partition
                if ((m + n) % 2 == 0) {
                    // Even number of elements: average of two middle elements
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                } else {
                    // Odd number of elements: middle element
                    return Math.max(maxLeft1, maxLeft2);
                }
            } else if (maxLeft1 > minRight2) {
                // Move partition1 to the left
                right = partition1 - 1;
            } else {
                // Move partition1 to the right
                left = partition1 + 1;
            }
        }

        // If no median is found (should not happen for valid inputs)
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}

// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int[] nums3 = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).sorted().toArray();

//         // Edge Case
//         if (nums3.length == 0) {
//             return 0.0;
//         } else if (nums3.length == 1) {
//             return (double) nums3[0];
//         }

//         if (nums3.length % 2 == 0) {
//             int i = nums3.length / 2;
//             return (double) (nums3[i] + nums3[i-1]) / 2;
//         } else {
//             int i = nums3.length / 2;
//             return (double) nums3[i];
//         }
//     }
// }
