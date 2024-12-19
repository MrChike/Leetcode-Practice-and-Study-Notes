# https://leetcode.com/problems/max-consecutive-ones/description/?envType=problem-list-v2&envId=ascyfkj5&difficulty=EASY

class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # Loop through the array
        # Find the number of highest occurence
        # return the count

        # Brute Force Approach
        # dic = {
        #     0: 0,
        #     1: 0
        # }

        # for i in nums:
        #     if i == dic.keys()[0]:
        #         dic[0] += 1
        #     elif i == dic.keys()[1]:
        #         dic[1] += 1

        # Optimized Approach
        left = 0
        max_ones = 0
        
        # Iterate through the array with the right pointer
        for right in range(len(nums)):
            # If we encounter a 0, move the left pointer forward to the next 1
            if nums[right] == 0:
                left = right + 1
            # Update the maximum number of consecutive 1's
            max_ones = max(max_ones, right - left + 1)
        
        return max_ones
