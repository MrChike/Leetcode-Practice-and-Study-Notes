class NumArray(object):
    # Optimized Approach
    def __init__(self, nums):
        """
        :type nums: List[int]
        """
        # Create a prefix sum array of size len(nums) + 1
        self.prefix_sum = [0] * (len(nums) + 1)
        
        # Fill the prefix_sum array with cumulative sums
        for i in range(len(nums)):
            self.prefix_sum[i + 1] = self.prefix_sum[i] + nums[i]

    def sumRange(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: int
        """
        # Return the sum of elements from index left to right
        return self.prefix_sum[right + 1] - self.prefix_sum[left]




# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)