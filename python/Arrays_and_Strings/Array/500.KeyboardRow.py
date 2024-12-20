# https://leetcode.com/problems/keyboard-row/description/?envType=problem-list-v2&envId=ascyfkj5

class Solution:
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        # Define the rows of the keyboard using sets
        row1 = set("qwertyuiop")
        row2 = set("asdfghjkl")
        row3 = set("zxcvbnm")
        
        result = []
        
        for word in words:
            # Convert the word to lowercase for case-insensitive comparison
            lower_word = set(word.lower())
            
            # Check if the word belongs to one of the rows
            if lower_word <= row1 or lower_word <= row2 or lower_word <= row3:
                result.append(word)
        
        return result
