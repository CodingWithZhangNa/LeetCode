class Solution {
    public void rotate(int[][] matrix) {
        /**
        顺时针旋转90度，先按行翻转，然后交换对角元素：
        **/
        
        int n = matrix.length;
        if (n < 1) return;
        for(int i = 0 ; i < n/2;++i){
            int[] temp = matrix[i];
            matrix[i] = matrix[n-i-1];
            matrix[n-i-1] = temp;
        }

        for(int i = 0;i < n;++i){
            for(int j = 0;j < i;++j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
