class Solution(object):
    def distinctDifferenceArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        
        # Step 1: Calculate distinct counts in prefixes
        prefix_count = [0] * n
        seen = set()
        
        for i in range(n):
            seen.add(nums[i])
            prefix_count[i] = len(seen)
        
        # Step 2: Calculate distinct counts in suffixes
        suffix_count = [0] * n
        seen.clear()
        
        for i in range(n - 1, -1, -1):
            seen.add(nums[i])
            suffix_count[i] = len(seen)
        
        # Step 3: Calculate the distinct difference array
        diff = [0] * n
        for i in range(n):
            if i + 1 < n:
                diff[i] = prefix_count[i] - suffix_count[i + 1]
            else:
                diff[i] = prefix_count[i]  # No suffix for the last element
        
        return diff
        
