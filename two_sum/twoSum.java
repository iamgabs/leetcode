import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mappedInputs = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if (mappedInputs.containsKey(complement)) {
                return new int[]{mappedInputs.get(complement), i};
            }
            mappedInputs.put(nums[i], i);
        }
        return new int[]{};
    }
}