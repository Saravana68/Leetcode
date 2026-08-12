import java.lang.Math;

class Solution {
    public int maximumDifference(int[] nums) {
        int result = -1;
        if(nums == null || nums.length <2) return result;

        int maxSeenSoFar = nums[nums.length - 1];
        for(int i = nums.length-2;i>=0;i--){
            if(maxSeenSoFar > nums[i]){
                int diff = maxSeenSoFar - nums[i];
                result = Math.max(result,diff);
            }
            maxSeenSoFar = Math.max(maxSeenSoFar,nums[i]);
        }

        return result;
    }
}