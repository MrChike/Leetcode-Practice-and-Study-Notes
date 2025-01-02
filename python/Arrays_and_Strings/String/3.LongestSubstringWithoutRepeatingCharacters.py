# https://leetcode.com/problems/longest-substring-without-repeating-characters/?envType=problem-list-v2&envId=ascc9wsi

class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        # https://www.youtube.com/watch?v=p-ss2JNynmw (sliding window technique)
        
        # Hash table to store the last seen index of each character
        char_index = {}
        # Pointers for the sliding window
        start = 0
        max_length = 0

        for end in range(len(s)):
            # If the character is already in the hash table and its index is within the window
            if s[end] in char_index and char_index[s[end]] >= start:
                # Move the start pointer to avoid duplicates
                start = char_index[s[end]] + 1
            
            # Update the hash table with the current character's index
            char_index[s[end]] = end

            # Calculate the length of the current window
            max_length = max(max_length, end - start + 1)
        
        return max_length

        