class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        n = len(nums)
        if n < 3:
            return 0

        # Dictionary to store counts of arithmetic subsequences
        dp = defaultdict(lambda: defaultdict(int))
        total_count = 0

        # Iterate through each pair of indices
        for j in range(n):
            for i in range(j):
                # Calculate the common difference
                diff = nums[j] - nums[i]

                # Count the number of subsequences ending at i with the same difference
                count_at_i = dp[i][diff]

                # Update the count for subsequences ending at j with the same difference
                dp[j][diff] += count_at_i + 1

                # Add to total count (only count subsequences of length >= 3)
                total_count += count_at_i

        return total_count
