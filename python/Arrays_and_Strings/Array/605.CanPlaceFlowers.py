# https://leetcode.com/problems/can-place-flowers/description/?envType=problem-list-v2&envId=ascyfkj5

class Solution(object):
    def canPlaceFlowers(self, flowerbed, n):
        """
        :type flowerbed: List[int]
        :type n: int
        :rtype: bool
        """
        count = 0
        len_f = len(flowerbed)
        for i in range(len_f):
            if flowerbed[i] == 0:
                if i < len_f - 1:
                    right = flowerbed[i+1] == 0
                else:
                    right = True
                if i > 0:
                    left = flowerbed[i - 1] == 0
                else:
                    left = True
                if left and right:
                    flowerbed[i] = 1
                    count+=1
                    if count == n:
                        return True
        return count >= n
