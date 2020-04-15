class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int begin,mid,end;
        begin = mid = 0;
        int m = matrix.length,n = matrix[0].length;
        end = m * n - 1;
        while(begin < end){
            mid = (begin + end) / 2;
            if (matrix[mid / n][mid % n] < target)
                begin = mid + 1;
            else
                end = mid - 1;
        }
        return matrix[begin / n][begin % n] == target;
    }
}
