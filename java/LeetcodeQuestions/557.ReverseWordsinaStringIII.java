// https://leetcode.com/problems/reverse-words-in-a-string-iii/?envType=problem-list-v2&envId=2o6pxcih

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
    
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            res.append(reversedWord).append(" ");
        }
        
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}

// import java.util.Arrays;

// class Solution {
//     public static String reverseString(String word) {
//         char[] charArray = word.toCharArray(); //string are immutable
//         int left = 0, right = word.length() - 1;

//         while (left < right) {
//             char temp = charArray[left];
//             charArray[left] = charArray[right];
//             charArray[right] = temp;
//             left++;
//             right--;
//         }

//         return new String(charArray);
//     }
//     public String reverseWords(String s) {
//         // Brute Force Approach
//         // if (s.length() == 1) {
//         //     return s;
//         // }

//         // String[] sArray = s.split(" ");
//         // StringBuilder returnString = new StringBuilder();
        
//         // for (String word: sArray) {
//         //     returnString.append(new StringBuilder(word).reverse().toString() + " ");
//         // }

//         // return returnString.toString().trim();

//         // Optimized Approach
//         if (s.length() == 1) {
//             return s;
//         }

//         String[] sArray = s.split(" ");
//         StringBuilder returnString = new StringBuilder();

//         for (String word: sArray) {
//             returnString.append(reverseString(word) + " ");
//         }

//         return returnString.toString().trim();
//     }
// }

// // can numerical be ascii characters
// // extra spces in string can be an edge case?
// // if length of string equals 1 return string.
// // Split string into array
// // loop through array
// // reverse each word with two pointer technique
// // append the reversed word to a stringbuilder
// // return string
// // Need to be able to explain both time and space complexity as i solve the problem
