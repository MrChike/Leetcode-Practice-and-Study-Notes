class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();

        for (int c = 0; c < nums.length; c++) {
            if (nums[c] == target) {
                result.add(c);
            }
        }
        return result;
    }
}

// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
//         // Step 1: Sort the array
//         Arrays.sort(nums);
        
//         // Step 2: Find the first occurrence using binary search
//         int first = binarySearch(nums, target, true);
        
//         // Step 3: If the target is not found, return an empty list
//         if (first == -1) {
//             return new ArrayList<>();
//         }
        
//         // Step 4: Find the last occurrence using binary search
//         int last = binarySearch(nums, target, false);
        
//         // Step 5: List to store the target indices
//         List<Integer> result = new ArrayList<>();
        
//         // Step 6: Add all indices from first to last occurrence
//         for (int i = first; i <= last; i++) {
//             result.add(i);
//         }
        
//         return result;  // Step 7: Return the result
//     }
    
//     // Binary search to find the first or last occurrence of the target
//     private int binarySearch(int[] nums, int target, boolean findFirst) {
//         int low = 0, high = nums.length - 1, result = -1;
        
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
            
//             if (nums[mid] == target) {
//                 result = mid;
//                 // If we are looking for the first occurrence, move left
//                 if (findFirst) {
//                     high = mid - 1;
//                 }
//                 // If we are looking for the last occurrence, move right
//                 else {
//                     low = mid + 1;
//                 }
//             } else if (nums[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
        
//         return result;
//     }
// }
