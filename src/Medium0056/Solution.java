class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length <= 1){
            return intervals;
        }
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare (int[] a,int[] b){
                return a[0] - b[0];
            }
        });

        List<int[]> res = new ArrayList<>();
        int[] cur = intervals[0];
        for(int i = 1;i < intervals.length;i++){
            if(intervals[i][0] > cur[1] ){
                res.add(cur);
                cur = intervals[i];
            }else{
                cur[1] = Math.max(cur[1],intervals[i][1]);
            }
        }
        res.add(cur);
        int[][] ans = new int[res.size()][2];
        for(int i = 0;i<res.size();i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}
