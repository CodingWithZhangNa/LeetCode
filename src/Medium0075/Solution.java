class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int curt = 0;
        while(curt <= right){
            if(nums[curt] == 2){
                swap(nums,curt,right);
                right--;
            }else if(nums[curt] == 0){
                swap(nums,curt,left);
                left++;
                curt++;
            }else{
                curt++;
            }
        }
    }

    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
