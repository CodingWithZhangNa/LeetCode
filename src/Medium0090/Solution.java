class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        if ((nums == null) || (nums.length == 0)) {
            return new ArrayList<>(res);
        }

        Arrays.sort(nums);
        List<Integer> temp = new LinkedList<>();
        res.add(temp);
        findSubSet(nums, temp, res, 0);

        return new ArrayList<>(res);
    }

    private void findSubSet(int[] nums, List<Integer> temp, Set<List<Integer>> res, int index) {
        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            res.add(new ArrayList<>(temp));
            findSubSet(nums, temp, res, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
