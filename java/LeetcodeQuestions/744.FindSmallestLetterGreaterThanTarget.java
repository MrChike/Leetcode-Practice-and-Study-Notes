// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?envType=problem-list-v2&envId=ascyfkj5

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // Iterate through the letters array
        for (int i = 0; i < letters.length; i++) {
            // When we find the first letter greater than the target, return it
            if (letters[i] > target) {
                return letters[i];
            }
        }
        
        // If no letter is greater than the target, return the first letter
        return letters[0];
    }
}
