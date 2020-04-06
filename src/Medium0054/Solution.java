class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new LinkedList<>();
        if(matrix.length==0)    return result;
        int upBound = 0;
        int rightBound = matrix[0].length-1;
        int leftBound = 0;
        int downBound = matrix.length-1;
        while(true){
            for(int i=leftBound; i<=rightBound; ++i)    
                result.add(matrix[upBound][i]);
            if(++upBound>downBound) break;
            for(int i=upBound; i<=downBound; ++i)   
                result.add(matrix[i][rightBound]);
            if(--rightBound<leftBound)  break;
            for(int i=rightBound; i>=leftBound; --i)   
                result.add(matrix[downBound][i]);
            if(--downBound<upBound) break;
            for(int i=downBound; i>=upBound; --i)   
                result.add(matrix[i][leftBound]);
            if(++leftBound>rightBound)  break;
        }
        return result;
    }
}
