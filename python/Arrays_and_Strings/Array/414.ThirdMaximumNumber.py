# https://leetcode.com/problems/third-maximum-number/description/?envType=problem-list-v2&envId=ascyfkj5&difficulty=EASY

class Solution(object):
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # Initialize three distinct maximums
        first_max = None
        second_max = None
        third_max = None
        
        for current_number in nums:
            # Skip duplicates
            if current_number == first_max or current_number == second_max or current_number == third_max:
                continue
            
            # Update the maximums in order
            if first_max is None or current_number > first_max:
                third_max = second_max
                second_max = first_max
                first_max = current_number
            elif second_max is None or current_number > second_max:
                third_max = second_max
                second_max = current_number
            elif third_max is None or current_number > third_max:
                third_max = current_number
        
        # Return the third maximum if it exists, otherwise the first maximum
        return third_max if third_max is not None else first_max
