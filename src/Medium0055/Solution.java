class Solution {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length < 2){
            return true;
        }

        int cur = nums.length - 1;
        for(int i = nums.length - 2; i>=0 ;i--){
            if(nums[i] + i >= cur) cur = i;
        }
        return cur == 0;
    }
}
