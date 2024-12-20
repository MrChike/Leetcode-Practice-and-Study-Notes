# https://leetcode.com/problems/next-greater-element-i/description/?envType=problem-list-v2&envId=ascyfkj5

class Solution:
    def nextGreaterElement(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        # Dictionary to store the next greater element for each number in nums2
        next_greater = {}
        stack = []
        
        # Traverse nums2 and populate the next_greater dictionary
        for num in nums2:
            # While the current number is greater than the top of the stack
            while stack and num > stack[-1]:
                smaller_num = stack.pop()
                next_greater[smaller_num] = num
            # Push the current number onto the stack
            stack.append(num)
        
        # Elements remaining in the stack have no greater element
        while stack:
            next_greater[stack.pop()] = -1
        
        # Build the result for nums1 using the next_greater dictionary
        return [next_greater[num] for num in nums1]
