class Solution {
    public int minIncrementForUnique(int[] nums) {
        int n=nums.length;
        int ans=0;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            if(nums[i]<=nums[i-1]){
                int inc=nums[i-1]+1-nums[i];
                ans+=inc;
                
                nums[i]=nums[i-1]+1;
            }
        }
        
        return ans;
    }
}