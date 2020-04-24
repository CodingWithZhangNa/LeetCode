class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
	int[][] a = new int[rowIndex][rowIndex];
	for(int i = 0; i < rowIndex; i++){
	    for(int j = 0; j <= i; j++){
	        if(j == 0 || j == i){
		     a[i][j] = 1;
		}else{
		     a[i][j] = a[i-1][j-1] + a[i-1][j];
		}
	     }
	}
		
	for(int j = 0; j <= rowIndex; j++){
	     if(j == 0 || j == rowIndex){
		ans.add(1);
	     }else{
		ans.add(a[rowIndex-1][j-1] + a[rowIndex-1][j]);
	     }
	}
	return ans;
    }
}
