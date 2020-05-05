class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if (len == 1){
            return 0;
        }
        if (nums[0] > nums[1] ){
            return 0;
        }
        if (nums[len - 1] > nums[len - 2] ) {
            return len - 1;
        }

        int l = 0;
        int r = len - 1;
        while (l < r){
            int mid = (l + r ) / 2;
            if (nums[mid] > nums[mid + 1]){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}
