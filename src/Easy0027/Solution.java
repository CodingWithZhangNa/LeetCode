package array;

public class Array0027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,3};
		int val = 1;
		Array0027 s1 = new Array0027();
		System.out.println(s1.removeElement(nums,val));
	}

	    public static int removeElement(int[] nums, int val) {
	        int count = 0;
	        for( int i = 0 ; i < nums.length ; i++ ){
	            if( nums[i] != val ){
	                nums[count] = nums[i];
	                count++;
	            }
	        }
	        return count;
	    }
	
}
