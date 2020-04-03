class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        helper(candidates,0,new LinkedList<Integer>(),target,list);
        return list;
    }

    public void helper(int[] candidates,int start,Deque<Integer> prev,int target,List<List<Integer>> result){
        if(target < 0) return;
        if(target == 0){
            result.add(new ArrayList<Integer>(prev));
            return;
        }

        for(int i = start;i < candidates.length; ++i){
            if(i!=start && candidates[i] == candidates[i-1]) continue;
            prev.addLast(candidates[i]);
            helper(candidates,i+1,prev,target-candidates[i],result);
            prev.removeLast();
        }
    }
}
