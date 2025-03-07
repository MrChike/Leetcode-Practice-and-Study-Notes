// https://leetcode.com/problems/kth-distinct-string-in-an-array/description/?envType=problem-list-v2&envId=20w3ezf2

// Mine with some gpt assistance
// class Solution {
//     public String kthDistinct(String[] arr, int k) {
//         HashMap<String, Integer> cache = new HashMap<>();
//         ArrayList<String> arr2 = new ArrayList<>();
//         int counter = 1;

//         for (int c = 0; c < arr.length; c++) {
//             if (cache.containsKey(arr[c])) {
//                 cache.put(arr[c], cache.get(arr[c]) + 1);
//             } else {
//                 cache.put(arr[c], 1);
//             }
//         }

//         for (int c = 0; c < arr.length; c++) {
//             if (cache.get(arr[c]) == 1) {
//                 arr2.add(arr[c]);
//             }
//         }

//         if (k <= arr2.size()) {
//             return arr2.get(k - 1);
//         } else {
//             return "";
//         }
//     }
// }

// Optimized by GPTSensei
class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> cache = new HashMap<>();
        
        // Pass 1: Build the cache
        for (String s : arr) {
            cache.put(s, cache.getOrDefault(s, 0) + 1);
        }

        // Pass 2: Check for the k-th distinct string
        int counter = 0;
        for (String s : arr) {
            if (cache.get(s) == 1) {
                counter++;
                if (counter == k) {
                    return s;
                }
            }
        }

        // If no k-th distinct string is found
        return "";
    }
}
