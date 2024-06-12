class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;

        int color[]=new int[3];
        for(int i=0;i<n;i++)
        {
            color[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<3;i++){
            while(color[i]-- >0){
                nums[j++]=i;
            }
        }
        
    }
}