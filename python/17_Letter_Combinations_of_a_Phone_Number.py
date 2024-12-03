class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        # Mapping of digits to letters
        digit_to_letters = {
            '2': 'abc',
            '3': 'def',
            '4': 'ghi',
            '5': 'jkl',
            '6': 'mno',
            '7': 'pqrs',
            '8': 'tuv',
            '9': 'wxyz'
        }
        
        # Base case: if digits is empty, return an empty list
        if not digits:
            return []
        
        # List to store the combinations
        result = []
        
        # Helper function for backtracking
        def backtrack(index, current_combination):
            # If the current combination is complete (index is equal to length of digits)
            if index == len(digits):
                result.append(current_combination)
                return
            
            # Get the current digit and the corresponding letters
            current_digit = digits[index]
            letters = digit_to_letters[current_digit]
            
            # Iterate through each letter corresponding to the current digit
            for letter in letters:
                # Recur with the next index and the updated combination
                backtrack(index + 1, current_combination + letter)
        
        # Start backtracking from the first digit
        backtrack(0, "")
        
        return result

        