// https://leetcode.com/problems/reverse-prefix-of-word/?envType=problem-list-v2&envId=2yoer6e7

// Efficient Solution using the requested ds&a
class Solution {
    public String reversePrefix(String word, char ch) {
        // Find index of first occurrence of ch
        int idx = word.indexOf(ch);
        if (idx == -1) return word;

        // Convert string to char array for in-place modifications
        char[] arr = word.toCharArray();
        
        // Two pointers to reverse from 0 to idx
        int left = 0, right = idx;
        while (left < right) {
            // Swap characters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr);
    }
}


// Efficient solution with inbuilt functions
// class Solution {
//     public String reversePrefix(String word, char ch) {
//         // Find the index of the first occurrence of ch
//         int idx = word.indexOf(ch);

//         // If ch is not found, return the word as-is
//         if (idx == -1) {
//             return word;
//         }

//         // Reverse the prefix from index 0 to idx (inclusive)
//         StringBuilder reversed = new StringBuilder(word.substring(0, idx + 1));
//         reversed.reverse();

//         // Append the remaining part of the word and return
//         return reversed.append(word.substring(idx + 1)).toString();
//     }
// }


// Brute Force Approach with chatgpt assistance
// class Solution {
//     public String reversePrefix(String word, char ch) {
//         // Edge Case
//         if (word == "") {
//             return word;
//         }

//         for (var i=0; i < word.length(); i++) {
//             System.out.println(word.charAt(i));
//             if (word.charAt(i) == ch) {
//                 StringBuilder prefix = new StringBuilder(word.substring(0, i + 1));
//                 System.out.println(prefix + " " +"prefix");
//                 prefix.reverse();
//                 String suffix = word.substring(i + 1);
//                 return prefix.toString() + suffix;
//             }
//         }

//         return word;
//     }
// }
