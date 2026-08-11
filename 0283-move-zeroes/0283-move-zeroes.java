class Solution {
    public void moveZeroes(int[] nums) {
        // int write = 0;
        // for( int read = 0; read < nums.length; read++){
        //     if(nums[read]!= 0){
        //         nums[write++] = nums[read];
        //     }
        // }
        // for(; write < nums.length; write++){
        //     nums[write] = 0;
        // }

        int write = 0;
        for( int read = 0; read < nums.length; read++){
            if(nums[read] != 0){
                int temp = nums[write];
                nums[write] = nums[read];
                nums[read] = temp;
                write++;
            }
        }
        
    }
}