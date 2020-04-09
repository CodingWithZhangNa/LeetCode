class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int index= 1,sum = n*n;
        int left = 0,right = n-1,top=0,bottom=n-1;
        while(true){
            for(int i = left;i <= right;i++){
                if(index <= sum){
                    res[top][i] = index++;
                }
            }
            top++;

            for(int i =top;i<=bottom;i++){
                if(index <= sum){
                    res[i][right]=index++;
                }
            }
            right--;

            for(int i = right;i>=left;i--){
                if(index <= sum){
                    res[bottom][i] = index++;
                }
            }
            bottom--;

            for(int i = bottom;i>=top;i--){
                if(index <= sum){
                    res[i][left] = index++;
                }
            }
            left++;

            if(index > sum){
                break;
            }
        }
        return res;
    }
}
