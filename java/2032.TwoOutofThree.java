// https://leetcode.com/problems/two-out-of-three/description/

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        // Create a HashMap to store the count of each number across the arrays
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        // Mark presence of numbers from nums1
        HashMap<Integer, Boolean> seenInFirst = new HashMap<>();
        for (int num : nums1) {
            if (!seenInFirst.containsKey(num)) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
                seenInFirst.put(num, true);
            }
        }

        // Mark presence of numbers from nums2
        HashMap<Integer, Boolean> seenInSecond = new HashMap<>();
        for (int num : nums2) {
            if (!seenInSecond.containsKey(num)) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
                seenInSecond.put(num, true);
            }
        }

        // Mark presence of numbers from nums3
        HashMap<Integer, Boolean> seenInThird = new HashMap<>();
        for (int num : nums3) {
            if (!seenInThird.containsKey(num)) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
                seenInThird.put(num, true);
            }
        }

        // Now check which numbers appear in at least two arrays
        List<Integer> result = new ArrayList<>();
        for (Integer num : countMap.keySet()) {
            if (countMap.get(num) >= 2) {
                result.add(num);
            }
        }

        return result;
    }
}


// class Solution {
//     public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
//         List<Integer> listInt = new ArrayList<>();
//         HashMap<Integer, List> cache = new HashMap<>();
//         ArrayList<Integer> temp = new ArrayList<>();

//         for (int c = 0; c < nums1.length; c++) {
//             temp.add(nums1[c]);
//         }

//          for (int c = 0; c < nums2.length; c++) {
//             // System.out.println(nums2[c]);
//             if (temp.contains(nums2[c])) {
//                 System.out.println("Yes it does");
//             }
//         }

//          for (int c = 0; c < nums3.length; c++) {
//             System.out.println(nums3[c]);
//         }
//         return listInt;
//     }
// }

// create an array. Loop through each arrays. Input into array. and any update hashmap

// Keep edge cases in mind

// 
