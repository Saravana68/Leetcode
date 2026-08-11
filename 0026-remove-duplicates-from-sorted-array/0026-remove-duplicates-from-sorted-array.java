class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 1;
        int candidate = 0;
        int slot = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[candidate]){
                unique++;
                nums[++slot] = nums[i];
                candidate = i;
            }
        }
        for(int i = slot+1; i<nums.length;i++){
            nums[i] = -1;
        }
        return unique;
    }
}

