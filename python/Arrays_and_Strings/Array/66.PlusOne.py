"""
https://leetcode.com/problems/plus-one/description/?envType=problem-list-v2&envId=ascyfkj5&difficulty=EASY

"""

class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        n = len(digits)
        
        # Traverse the digits array from right to left
        for i in range(n - 1, -1, -1):
            if digits[i] < 9:
                digits[i] += 1
                return digits
            digits[i] = 0
        
        # If the loop finishes, it means we have a carry for the most significant digit
        return [1] + digits


# class Solution(object):
#     def plusOne(self, digits):
#         """
#         :type digits: List[int]
#         :rtype: List[int]
#         """
#         # Select the last element in the array
#         if str(digits[-1]).startswith('0'):
#             pass
#         else:
#             pass

        
        