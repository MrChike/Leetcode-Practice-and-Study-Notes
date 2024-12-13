class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        # use a set to get the intersection
        # convert the set to a list
        # return the list

        new_list = list(set(nums1)) + list(set(nums1))
        empty_list = []

        for i in new_list:
            if i in nums1 and i in nums2:
                empty_list.append(i)

        return list(set(empty_list))

        # Optimized Approach
        # Convert both lists to sets
        # set1 = set(nums1)
        # set2 = set(nums2)
        
        # # Find the intersection and return it as a list
        # return list(set1 & set2)

        