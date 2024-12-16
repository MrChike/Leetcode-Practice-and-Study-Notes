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

        # Optimized Approach
         # Step 1: Calculate the expected sum of the range [0, n]
        array_size = len(nums)
        expected_sum = array_size * (array_size + 1) // 2
        
        # Step 2: Calculate the actual sum of the given array
        actual_sum = sum(nums)
        
        # Step 3: The missing number is the difference between the expected and actual sum
        missing_number = expected_sum - actual_sum
        
        return missing_number
        