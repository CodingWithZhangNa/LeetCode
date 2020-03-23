class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-i-1;
        int area = 0;

        while(i < j){
            int tmpArea = height[i] > height[j] ? height[j] * (j-i) : height[i] * (j-i);
            area = tmpArea > area ? tmpArea : area;

            if(height[i] > height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return area;
    }
}
