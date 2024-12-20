# https://leetcode.com/problems/relative-ranks/description/?envType=problem-list-v2&envId=ascyfkj5

class Solution:
    def findRelativeRanks(self, score):
        """
        :type score: List[int]
        :rtype: List[str]
        """
        # Step 1: Pair scores with their indices and sort them in descending order
        sorted_scores = sorted(enumerate(score), key=lambda x: x[1], reverse=True)

        # Step 2: Assign ranks
        ranks = [""] * len(score)
        for rank_index, (original_index, _) in enumerate(sorted_scores):
            if rank_index == 0:
                ranks[original_index] = "Gold Medal"
            elif rank_index == 1:
                ranks[original_index] = "Silver Medal"
            elif rank_index == 2:
                ranks[original_index] = "Bronze Medal"
            else:
                ranks[original_index] = str(rank_index + 1)

        return ranks
