class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        res, temp = [], []

        def backtrack(i):
            if i == n:
                res.append(temp[:])
                return
            
            backtrack(i + 1)

            temp.append(nums[i])
            backtrack(i + 1)
            temp.pop()

        backtrack(0)

        return res