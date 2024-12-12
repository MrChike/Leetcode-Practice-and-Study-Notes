# https://leetcode.com/problems/contains-duplicate-ii/description/?envType=problem-list-v2&envId=ascyfkj5&difficulty=EASY

class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        # Brute Force Approach
        # -------------

        # Optimized Approach
        # Dictionary to store the most recent index of each number
        index_map = {}
        
        # Iterate over the list
        for i, num in enumerate(nums):
            # If the number is already in the dictionary and the difference in indices is <= k
            if num in index_map and i - index_map[num] <= k:
                return True
            
            # Update the most recent index of the number
            index_map[num] = i
        
        # If no such pair is found, return False
        return False

        