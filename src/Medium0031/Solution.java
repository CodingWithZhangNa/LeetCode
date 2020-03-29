class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if(len <= 1){
            return;
        }
        for (int i = len - 2; i >= 0;i--){
            if(nums[i] < nums[i+1]){
                int swap = i + 1;
                for ( int j = i + 1; j < len; j++){
                    if (nums[j] > nums[i] && nums[j] < nums[swap]){
                        swap = j;
                    }
                }
                int tmp = nums[i];
                nums[i] = nums[swap];
                nums[swap] = tmp;
                Arrays.sort(nums,i+1,len);
                return;
            }
        }
        Arrays.sort(nums);
    }

}
