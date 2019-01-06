class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        returnList = []
        for i in range(len(nums)):
            if (len(returnList) == 0):
                if(nums[i] <= target):
                    for j in range(i+1, len(nums)):
                        if (nums[j] <= target):
                            if (nums[i] + nums[j] == target):
                                returnList.append(i)
                                returnList.append(j)
                                break
                        
                    
                
                
        return returnList        
