class Solution {
    public int[] searchRange(int[] nums, int target) {
        int mid = findMid(nums, target);
        if (mid == -1) return new int[]{-1, -1};
        int start = mid, end = mid;
        while (start > 0) {
            if (nums[start - 1] == nums[mid]) {
                start = start - 1;
            } else
                break;
        }
        while (end < nums.length - 1) {
            if (nums[end + 1] == nums[mid]) {
                end = end + 1;
            } else
                break;
        }
        return new int[]{start, end};

    }

    public int findMid(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid = 0;
        while (l <= r) {
            mid = (r + l) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) r = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }
}
