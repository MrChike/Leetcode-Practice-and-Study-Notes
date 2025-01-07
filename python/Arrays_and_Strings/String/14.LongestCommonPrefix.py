# https://leetcode.com/problems/longest-common-prefix/description/?envType=problem-list-v2&envId=ascc9wsi

class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        # What's Prefix
        # Iterate through each string simultaneously
        # If they match store, else return empty string

        # dic = {i:0 for i in str(strs[0])}
        # cache = ''
        
        # for i in range(1, len(strs)):
        #     for j in strs[i]:
        #         if j in dic:
        #             dic[j] += 1

        # print(dic)
        # for i in dic.keys():
        #     # print(dic[i])
        #     if dic[i] > 1:
        #         cache += i

        # return cache

        # Optimized Approach
        if not strs:
            return ""
        
        # Start with the first string as the prefix
        prefix = strs[0]
        
        # Compare the prefix with each string in the array
        for s in strs[1:]:
            # Reduce the prefix until it matches the start of the current string
            while not s.startswith(prefix):
                prefix = prefix[:-1]  # Remove the last character from the prefix
                if not prefix:
                    return ""  # If prefix becomes empty, no common prefix exists
        
        return prefix

