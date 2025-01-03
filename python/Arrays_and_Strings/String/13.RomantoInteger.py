# https://leetcode.com/problems/roman-to-integer/?envType=problem-list-v2&envId=ascc9wsi

class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        # Store all the symbols in hash table for quick lookup 0(1)
        # iterate through the string s
        # Compute real time 
        # return the value

        # Brute Force Approach
        # roman = {
        #    "I": 1,
        #    "II": 2,
        #    "IV": 4,
        #    "V": 5,
        #    "IX": 9,
        #    "X": 10,
        #    "XII": 12,
        #    "XXVII": 27,
        #    "XL": 40,
        #    "L": 50,
        #    "XC": 90,
        #    "C": 100,
        #    "CD": 400,
        #    "D": 500,
        #    "CM": 900,
        #    "M": 1000, 
        # }

        # # First iterate in twos and check if present in hash table
        # # if yes, update cache with number and move to the next
        # # if no, iterate in one and check if present in hash table
        # # if yes, update cache with number and move to the next
        # counter = 2
        # cache = 0
        # m = "MCMXCIV"

        # for i, j in enumerate(m):
        #     a = m[i:counter]

        #     if a in roman:
        #         # cache += roman[a]
        #         print(a, roman[a])
        #     else:
        #         # cache += roman[j]
        #         print(j, roman[j])
        #     counter += 1

        # print(cache)

        # Optimized Approach
        roman_to_int = {
            'I': 1, 'V': 5, 'X': 10, 'L': 50, 
            'C': 100, 'D': 500, 'M': 1000
        }

        total = 0
        n = len(s)

        for i in range(n):
            # If the current value is less than the next value, subtract it
            if i < n - 1 and roman_to_int[s[i]] < roman_to_int[s[i + 1]]:
                total -= roman_to_int[s[i]]
            else:
                # Otherwise, add the current value
                total += roman_to_int[s[i]]
        
        return total



        