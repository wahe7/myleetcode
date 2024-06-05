class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
         List<List<Integer>> ans=new ArrayList<>();
        if(n==4){
            
        
        int cnt=0;
        for(int i=0;i<4;i++)
        {
            cnt+=nums[i];
        }
     if(cnt<0){
        return ans; 
     }
      else{
          
      }
        }
        for(int i=0;i<n-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int l=j+1;
                int r=n-1;
                while(l<r){
                    int sum=nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum==target)
                    {
                        ans.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                    
                  
                      while(l<r && nums[l]==nums[l+1]){
                    l++;
                }
                
                while(r>l && nums[r]==nums[r-1]){
                    r--;
                }
                    l++;
                    r--;
                }
                    else if(sum<target){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
                
              
            }
        }
        
        return ans;
    }
}