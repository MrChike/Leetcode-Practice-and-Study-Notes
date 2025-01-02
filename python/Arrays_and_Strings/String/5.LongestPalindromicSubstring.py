# https://leetcode.com/problems/longest-palindromic-substring/description/?envType=problem-list-v2&envId=ascc9wsi

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        if not s or len(s) < 1:
            return ""

        # Initialize variables to store the result
        max_length = 0
        start_index = 0

        for i in range(len(s)):
            # Check for odd-length palindromes
            left, right = i, i
            while left >= 0 and right < len(s) and s[left] == s[right]:
                current_length = right - left + 1
                if current_length > max_length:
                    max_length = current_length
                    start_index = left
                left -= 1
                right += 1

            # Check for even-length palindromes
            left, right = i, i + 1
            while left >= 0 and right < len(s) and s[left] == s[right]:
                current_length = right - left + 1
                if current_length > max_length:
                    max_length = current_length
                    start_index = left
                left -= 1
                right += 1

        # Return the longest palindrome
        return s[start_index:start_index + max_length]
