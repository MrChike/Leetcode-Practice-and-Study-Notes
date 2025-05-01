// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=problem-list-v2&envId=two-pointers

class Solution {
    public int strStr(String haystack, String needle) {
        // Brute Force Approach
        // int p1 = 0;
        // int p2 = haystack.length();

        // if (haystack.contains(needle)) {
        //     return haystack.indexOf(needle);
        // } else {
        //     return -1;
        // }

        // Optimized Approach
        // Get the lengths of the haystack and needle
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        // If the needle is empty, the answer is 0 (nothing to search)
        if (needleLength == 0) return 0;

        // Use two pointers to compare
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            int j = 0; // Pointer for the needle

            // Compare characters while they match
            while (j < needleLength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // If we matched the entire needle, return the starting index
            if (j == needleLength) {
                return i;
            }
        }

        // If no match is found, return -1
        return -1;
    }
}

// check if the needle string is in the haystack
// Use Two Pointers
// loop through each condition until needle is found. (While needle not in haystack)
    // if yes, return the index of the string
    // if no, return -1

// observation: split haystack into the length of needle to check
