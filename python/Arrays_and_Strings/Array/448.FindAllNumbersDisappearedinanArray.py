# https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/?envType=problem-list-v2&envId=ascyfkj5&difficulty=EASY

class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # Step 1: Place numbers in their correct positions
        index = 0
        while index < len(nums):
            correct_position = nums[index] - 1  # Target index for nums[index]
            if nums[index] != nums[correct_position]:  # Swap if not in correct position
                nums[index], nums[correct_position] = nums[correct_position], nums[index]
            else:
                index += 1

        # Step 2: Collect numbers that are missing
        missing_numbers = []
        for index in range(len(nums)):
            if nums[index] != index + 1:  # Check if the number matches its index + 1
                missing_numbers.append(index + 1)

        return missing_numbers
