# https://leetcode.com/problems/teemo-attacking/description/?envType=problem-list-v2&envId=ascyfkj5&difficulty=EASY

class Solution(object):
    def findPoisonedDuration(self, attackTimes, poisonDuration):
        """
        :type attackTimes: List[int]
        :type poisonDuration: int
        :rtype: int
        """
        # Edge case: No attacks
        if not attackTimes:
            return 0

        # Initialize total poisoned duration
        totalPoisonedTime = 0

        # Process each attack except the last
        for currentIndex in range(len(attackTimes) - 1):
            # Calculate time until the next attack
            timeUntilNextAttack = attackTimes[currentIndex + 1] - attackTimes[currentIndex]
            # Add the effective poison duration
            totalPoisonedTime += min(timeUntilNextAttack, poisonDuration)

        # Add the poison duration of the last attack
        totalPoisonedTime += poisonDuration

        return totalPoisonedTime

        