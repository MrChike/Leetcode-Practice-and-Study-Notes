# https://leetcode.com/problems/move-zeroes/?envType=problem-list-v2&envId=ascyfkj5&difficulty=EASY

class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        # Step 1: Initialize pointers
        non_zero_position = 0  # Tracks where the next non-zero element should go
        
        # Step 2: Traverse the array
        for current_position in range(len(nums)):
            if nums[current_position] != 0:
                # Swap non-zero element to the non_zero_position
                nums[non_zero_position], nums[current_position] = nums[current_position], nums[non_zero_position]
                non_zero_position += 1
