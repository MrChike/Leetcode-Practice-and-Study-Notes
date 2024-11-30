"""
712. Minimum ASCII Delete Sum for Two Strings

Given two strings s1 and s2, return the lowest ASCII sum of deleted characters to make two strings equal.

Example 1:

Input: s1 = "sea", s2 = "eat"
Output: 231
Explanation: Deleting "s" from "sea" adds the ASCII value of "s" (115) to the sum.
Deleting "t" from "eat" adds 116 to the sum.
At the end, both strings are equal, and 115 + 116 = 231 is the minimum sum possible to achieve this.
Example 2:

Input: s1 = "delete", s2 = "leet"
Output: 403
Explanation: Deleting "dee" from "delete" to turn the string into "let",
adds 100[d] + 101[e] + 101[e] to the sum.
Deleting "e" from "leet" adds 101[e] to the sum.
At the end, both strings are equal to "let", and the answer is 100+101+101+101 = 403.
If instead we turned both strings into "lee" or "eet", we would get answers of 433 or 417, which are higher.
 

Constraints:

1 <= s1.length, s2.length <= 1000
s1 and s2 consist of lowercase English letters.

Topics:
String
Dynamic Programming
"""

# TODO: My Solution

# import string

# class Solution(object):
#     def minimumDeleteSum(self, s1, s2):
#         """
#         :type s1: str
#         :type s2: str
#         :rtype: int
#         """
#         # split each character set
#         # compare and cancel each characters until only the unique ones exist
#         # Convert each character to ascii
#         # sum up each ascii
#         # return the total

#         # split each character set
#         set1 = [i for i in s1]
#         set2 = [i for i in s2]

#         # compare and cancel each characters until only the unique ones exist
#         difference = set(set1).symmetric_difference(set(set2))

#         print(string.ascii_letters(list(difference)[0]))

        
# Suggested Solution
class Solution(object):
    def minimumDeleteSum(self, s1, s2):
        # Get the lengths of both strings
        m, n = len(s1), len(s2)

        # Initialize a 2D DP table with size (m+1) x (n+1)
        dp = [[0] * (n + 1) for _ in range(m + 1)]

        # Fill the DP table
        for i in range(1, m + 1):
            dp[i][0] = dp[i - 1][0] + ord(s1[i - 1])  # If s2 is empty, delete all chars of s1
        for j in range(1, n + 1):
            dp[0][j] = dp[0][j - 1] + ord(s2[j - 1])  # If s1 is empty, delete all chars of s2

        # Iterate over each character in both strings
        for i in range(1, m + 1):
            for j in range(1, n + 1):
                if s1[i - 1] == s2[j - 1]:  # Characters are the same, no deletion needed
                    dp[i][j] = dp[i - 1][j - 1]
                else:
                    # Min cost by deleting from either string
                    dp[i][j] = min(dp[i - 1][j] + ord(s1[i - 1]),  # Delete s1[i-1]
                                   dp[i][j - 1] + ord(s2[j - 1]))  # Delete s2[j-1]

        # The result will be in dp[m][n]
        return dp[m][n]
