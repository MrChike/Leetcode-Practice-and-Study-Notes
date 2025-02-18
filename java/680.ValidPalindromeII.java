// https://leetcode.com/problems/valid-palindrome-ii/description/?envType=problem-list-v2&envId=2o6pxcih

class Solution {
    public boolean validPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                // Check by skipping one character from either side
                return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
            }
            start++;
            end--;
        }
        return true; // Already a palindrome
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


// import java.util.*;

// class Solution {
//     public boolean validPalindrome(String s) {
//         s = s.trim();
//         char[] char_str = s.toCharArray();
//         int start = 0, end = char_str.length - 1;
//         ArrayList<Boolean> bools = new ArrayList<>();
//         int cache = 0;

//         if (s.length() == 1) {
//             return false;
//         }

//         while (start <= end) {
//             bools.add(start <= end);         
//             if (start < end) { //To not repeat middle number twice
//                 bools.add(start == end);
//             }
//             start++;
//             end--;
//         }

//         System.out.println(bools);
//         start = 0; 
//         end = char_str.length - 1;

//         while (start <= end) {
//             if (bools.get(start) && bools.get(end)  == false) {
//                 cache += 1;
//             }
//             start++;
//             end--;
//         }

//         if (cache <= 1) {
//             return true;
//         } else {
//             return false;
//         }
//     }
// }

// // Edge Case
//     // if there is one character return false
//     // if there are spaces at both ends. Trim it
// // Algorithm
//     // create pointers for start and end
//     // iterate through each string
//     // create an array with the number of items from the length of a string
//     // append each boolean result to the array
//     // while condition should stop when pointer are equals to each other
//     // reset the pointers
//     // iterate through the array
//         // if the count of False is only 1, return true
//         // else return false
