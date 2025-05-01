// https://leetcode.com/problems/minimum-common-value/description/?envType=problem-list-v2&envId=2o6pxcih
// class Solution {
//     public int getCommon(int[] nums1, int[] nums2) {
//         int pointer1 = 0;
//         int pointer2 = 0;

//         // Iterate while pointers are within bounds of both arrays
//         while (pointer1 < nums1.length && pointer2 < nums2.length) {
//             if (nums1[pointer1] == nums2[pointer2]) {
//                 // Found a common element
//                 return nums1[pointer1];
//             } else if (nums1[pointer1] < nums2[pointer2]) {
//                 // Move pointer1 forward
//                 pointer1++;
//             } else {
//                 // Move pointer2 forward
//                 pointer2++;
//             }
//         }

//         // If no common element was found
//         return -1;
//     }
// }


class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < nums1.length && pointer2 < nums2.length) {
            System.out.println(nums1[pointer1]);
            System.out.println(nums2[pointer2]);
            pointer1++;
            pointer2++;
        }
        return -1;
    }
}

// edge case: 
    // The items are at the end of the array
    // If the array is inequal ration 4:2 
        // Pick one item from the array and iterate on each items

// Start from the beginning of the array
// iterate and compare for match
    // if match is found return intersecting number
    // if not return -1
