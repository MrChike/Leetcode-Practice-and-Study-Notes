# https://leetcode.com/problems/summary-ranges/description/?envType=problem-list-v2&envId=ascyfkj5&difficulty=EASY

class Solution(object):
    def summaryRanges(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        # Brute Force

        # Optimized approach
        result = []
        
        if not nums:
            return result
        
        # Initialize the first range with the first number
        start = nums[0]
        
        for i in range(1, len(nums) + 1):
            # If we have reached the end or the next number is not consecutive
            if i == len(nums) or nums[i] != nums[i - 1] + 1:
                # If start is the same as the current number, it's a single number range
                if start == nums[i - 1]:
                    result.append(str(start))
                else:
                    result.append(str(start) + "->" + str(nums[i - 1]))  # Concatenating strings
                # Start a new range from the current number (if not at the end)
                if i < len(nums):
                    start = nums[i]
        
        return result
