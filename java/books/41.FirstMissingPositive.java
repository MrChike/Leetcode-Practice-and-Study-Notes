// https://leetcode.com/problems/first-missing-positive/description/?envType=problem-list-v2&envId=20w3ezf2

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        // Step 1: Place each number in its correct index (if possible)
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with its correct index position nums[nums[i] - 1]
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Step 2: Find the first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // Step 3: If all numbers are in place, return n + 1
        return n + 1;
    }
}


// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         Arrays.sort(nums);
//         int[] mainRange = IntStream.range(nums[0], nums[nums.length-1] + 2).toArray();
//         int[] preRange = IntStream.range(1, nums[0]).toArray();
//         ArrayList mergeRange = new ArrayList();

//         for (int range: preRange) {
//             mergeRange.add(range);
//         }

//         for (int range: mainRange) {
//             mergeRange.add(range);
//         }

//         System.out.println(Arrays.toString(nums));
//         System.out.println(mergeRange);

//         int cache = 0;

//         for (int c = 0; c < nums.length; c++) {
//             if (nums[c] - cache <= 0) {
//                 continue;
//             } else if (nums[c] - cache == 1) {
//                 continue;
//             } else {
//                 return nums[c] - cache;
//             }
//         }
//         return 0;
//     }
// }
