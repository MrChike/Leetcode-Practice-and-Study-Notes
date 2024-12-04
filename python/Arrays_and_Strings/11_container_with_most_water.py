"""
11. Container With Most Water
Solved
Medium
Topics
Companies
Hint
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

 

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
"""

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        i, j = 0, len(height) - 1  # Initialize two pointers
        max_area = 0  # Variable to store the maximum area

        while i < j:
            # Calculate the area between the two lines
            area = min(height[i], height[j]) * (j - i)
            max_area = max(max_area, area)  # Update the max area if the current area is larger

            # Move the pointer pointing to the shorter line
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1

        return max_area
