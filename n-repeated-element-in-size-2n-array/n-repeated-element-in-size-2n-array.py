class Solution:
    def repeatedNTimes(self, nums: List[int]) -> int:
        l = len(nums)
        if l == 0:
            return 0
        
        n = l / 2 
        unique = n + 1
        element = -1
        print(n, unique)
        
        # element 구하기
        foo = {}
        for num in nums:
            foo[num] = foo.get(num, 0) + 1
        
        for key in foo.keys():
            if foo[key] == n:
                return key
        
        # n번 반복되는 element를 반환해야함
        return element
        