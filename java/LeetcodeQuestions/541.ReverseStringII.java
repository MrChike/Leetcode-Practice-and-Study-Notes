// https://leetcode.com/problems/reverse-string-ii/description/?envType=problem-list-v2&envId=2o6pxcih

// ME
// class Solution {
//     public String reverseStr(String s, int k) {
//         // Edge Case
//         String reverse = new StringBuilder(s).reverse().toString();
//         System.out.println(reverse);
//         System.out.println(s);

//         if (s.length() < k) {
//             System.out.println("s is less than k in characters");
//         } else if (s.length() < 2 * k >= k) {
//             System.out.println("s is less than k in characters");
//         }

//         return "";
        
//     }
// }

// If string s is less than k characters, reverse all
// If the string is less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

// Start from beginning of string
// reverse the first string
// count to the next 2k characters then reverse string
// if the remaining characters are less than k reverse the remaining

// CGP
class Solution {
    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;

        for (int i = 0; i < n; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            while (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }
        return new String(charArray);
    }
}


// DSQ
// class Solution {
//     public String reverseStr(String s, int k) {
//         char[] arr = s.toCharArray();
//         for (int i = 0; i < arr.length; i += 2 * k) {
//             int start = i;
//             int end = Math.min(i + k - 1, arr.length - 1);
//             reverse(arr, start, end);
//         }
//         return new String(arr);
//     }
    
//     private void reverse(char[] arr, int start, int end) {
//         while (start < end) {
//             char temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }
