from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mapped_hashmap: dict = {}

        for i, num in enumerate(nums):
            complement: int = target - num 
            if complement in mapped_hashmap:
                return [mapped_hashmap[complement], i]
            mapped_hashmap[num] = i