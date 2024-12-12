# https://leetcode.com/problems/single-number/description/?envType=problem-list-v2&envId=ascyfkj5&difficulty=EASY

class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # Iterate through the array
        # Find the unique item in the array
        # return it

        # Brute Force Approach:
        # Create a new array
        # iterate through the elements in nums array
        # store the element found in the new array
        # compare the current iteration with the element stored

        for i in nums:
            if nums.count(i) == 1:
                return i

        # Optimized Approach
        


        