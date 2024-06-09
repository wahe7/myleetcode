class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int n=nums.length;
        int prefixmod=0;
        int r=0;
        int modgrp[]=new int[k];
        modgrp[0]=1;
        for(int num:nums)
        {
            prefixmod=(prefixmod+num%k+k)%k;
            r+=modgrp[prefixmod];
            modgrp[prefixmod]++;
        }
        
        return r;
    }
}