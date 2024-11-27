"""
The problem is asking you to minimize the total number of stones remaining in an array of piles after performing a specific operation exactly **k** times. Here's a breakdown of the problem:

1. **Input Details:**
   - You have an array called `piles`, where each element `piles[i]` represents the number of stones in the i-th pile.
   - You are also given an integer `k`, which indicates how many times you need to perform the operation.

2. **Operation:**
   - In each operation, you pick any pile `piles[i]`, and remove **half** of the stones from it. The number of stones removed is the floor of half the stones in that pile, i.e., you remove `floor(piles[i] / 2)` stones from the pile.
   - You are allowed to perform the operation on the same pile multiple times (which is important to consider).

3. **Goal:**
   - Your task is to perform the operation **exactly k times** and minimize the total number of stones that remain across all piles.

4. **Key Concept:**
   - The operation should focus on reducing the largest piles first because reducing a larger pile will result in a larger reduction in total stones.
   - After performing the operation on a pile, the number of stones in that pile becomes smaller, and you can apply the operation on it again if necessary.

5. **Approach:**
   - In order to minimize the remaining stones, you should always apply the operation to the pile that currently has the most stones. This will give you the greatest reduction per operation.
   - You can track the current state of the piles, apply the operation, and repeat this for a total of `k` times.
   
By the end of the `k` operations, the total number of stones left in all piles should be as small as possible.
"""

import heapq

class Solution(object):
    def minStoneSum(self, piles, k):
        """
        :type piles: List[int]
        :type k: int
        :rtype: int
        """
        max_heap = [-p for p in piles]
        heapq.heapify(max_heap)
        
        # Perform the operation k times
        for _ in range(k):
            # Extract the largest pile (negate to get original value)
            largest = -heapq.heappop(max_heap)
            
            # Calculate new number of stones after operation
            new_pile = largest - (largest // 2)
            
            # Push the updated pile back into the heap (negate the value again)
            heapq.heappush(max_heap, -new_pile)
        
        # The total remaining stones are the sum of the values in the heap (negated)
        return -sum(max_heap)


solution = Solution()
solution.minStoneSum([5,4,9], 2)