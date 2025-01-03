class Solution(object):
    def areOccurrencesEqual(self, s):
        """
        :type s: str
        :rtype: bool
        """
        # Create a hash table to count character frequencies
        count = {}
        for char in s:
            count[char] = count.get(char, 0) + 1

        # Get all frequency values
        frequencies = list(count.values())

        # Check if all frequencies are the same
        return all(f == frequencies[0] for f in frequencies)
