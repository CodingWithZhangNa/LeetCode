class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int dp[][] = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++){
            for (int j = 0; j < triangle.get(i).size(); j++){
                if (j==0){
                    dp[i][j] = dp[i-1][j] + triangle.get(i).get(j);
                }else if (j == triangle.get(i).size() - 1){
                    dp[i][j] = dp[i-1][j-1] + triangle.get(i).get(j);
                }else{
                    dp[i][j] = Math.min(dp[i-1][j-1] + triangle.get(i).get(j),dp[i-1][j]+triangle.get(i).get(j));
                }
            }
        }
        int res = dp[n-1][0];
        for (int i = 1; i < triangle.size(); i++){
            res = Math.min(res,dp[n-1][i]);
        }
        return res;

    }
}
