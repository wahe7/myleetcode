class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        if(n==3)
        {
            return nums[0]+nums[1]+nums[2];
        }
         int minn=nums[0]+nums[1]+nums[2];
         int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
           
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++)
                {
                   int sum=nums[i]+nums[j]+nums[k];
                    int diff=Math.abs(sum-target);
                    if(diff<=min){
                        minn=sum;
                        min=diff;
                    }
                }
            }
        
        }

        return minn;
    }
}