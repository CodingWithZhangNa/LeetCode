package array;

public class Array006 {
	
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array006 s1 = new Array006();
		int[] nums = {1,1,2,3,4,4,5};
		int len = s1.removeDuplicates(nums);
		System.out.println(len);
	    for(int i=0;i<len;i++)
	        {
	        	System.out.print(nums[i]);
	        }
	 }
	
	    public static int removeDuplicates(int[] nums) {
	        if(nums.length == 0) return 0;
	        int i = 0;
	        for(int j =1;j<nums.length;j++){
	            if(nums[j]!=nums[i]){
	                i++;
	                nums[i] = nums[j];
	            }
	        }
	        return i+1;
	    }
	    

}
