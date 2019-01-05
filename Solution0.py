class Solution:

    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """

        sum = len(nums1) + len(nums2)
        returnList = list(range(sum))
        c1 = 0
        c2 = 0
        for i in range(sum):
            if c1 < len(nums1) and c2 < len(nums2):
                if nums1[c1] <= nums2[c2]:
                    returnList[i] = nums1[c1];
                    c1 = c1 +1
                else:
                    returnList[i] = nums2[c2];
                    c2 = c2 +1
            elif c1 < len(nums1) and c2 >= len(nums2):
                returnList[i] = nums1[c1];
                c1 = c1 +1
            else:
                returnList[i] = nums2[c2];
                c2 = c2 +1


        mid = len(returnList) // 2

        if len(returnList) % 2 == 0:
            return (returnList[mid] + returnList[mid -1] )/2
        else:
            return returnList[mid]
