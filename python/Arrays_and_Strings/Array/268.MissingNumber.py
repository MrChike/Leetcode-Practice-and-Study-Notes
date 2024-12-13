# https://leetcode.com/problems/missing-number/?envType=problem-list-v2&envId=ascyfkj5&difficulty=EASY

class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # Get the length of the array
        # sort the array
        # create a range from 0 to array.length
        # iterate through the array to find the difference
        # if difference is is greater than 1, return the previous item + 1

        # Brute Force Approach
        arr_length = len(nums)
        sorted_array = sorted(nums)
        num_cache = 0

        for i in range(0, arr_length):
            print('a',sorted_array[i])
            if sorted_array[i] - num_cache > 1:
                print('b',sorted_array[i])
                return num_cache + 1
            elif len([num_cache]) == 1 and sorted_array[i] == num_cache:
                return num_cache
            
            
            num_cache = i
            print('c',num_cache)

        return num_cache + 1

        # Optimized Approach
        #  n = len(nums)  # O(1) - Getting the length of the array
        # expected_sum = n * (n + 1) // 2  # O(1) - Calculating the expected sum (constant time operation)
        # actual_sum = sum(nums)  # O(n) - Summing up all the elements in the array
        # return expected_sum - actual_sum  # O(1) - Subtracting two integers
        