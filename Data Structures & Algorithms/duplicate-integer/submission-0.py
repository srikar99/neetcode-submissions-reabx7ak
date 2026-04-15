class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        res = False
        dup_set = set()

        for i in nums:
            if i in dup_set:
                return True
            
            dup_set.add(i)
        
        return False