"""
https://leetcode.com/problems/search-insert-position/?envType=problem-list-v2&envId=ascyfkj5&difficulty=EASY

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104

Topics: Array, Binary Search
"""

class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        # TODO: If arr_len is odd round down
        arr_len = len(nums)/2
        left_section = None
        right_section = None
        
        left_section = nums[:arr_len]
        right_section = nums[arr_len:]

        if target in left_section:
            pass
        
        if target in right_section:
            pass 
        