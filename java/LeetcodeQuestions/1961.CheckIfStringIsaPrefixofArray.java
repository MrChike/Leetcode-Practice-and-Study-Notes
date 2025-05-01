// https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/description/?envType=problem-list-v2&envId=2o6pxcih

// My approach
// Trim the string to ensure it matches with the words array
// Create a StringBuilder
// iterate through the words array 
// append the items to stringbuilder
// compare string s with stringbuilder

class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder str_cache = new StringBuilder();
        int p1 = 0, arr_length = words.length;
        
        while (p1 < arr_length) {
            str_cache.append(words[p1]);
            p1++;

            if (str_cache.toString().equals(s)) {
                return true;
            }
        }

        return false;
    }
}

