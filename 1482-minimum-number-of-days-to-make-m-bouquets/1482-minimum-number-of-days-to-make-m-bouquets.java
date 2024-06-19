class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int end=0;
        int start=0;
        int ans=-1;
        for(int d:bloomDay){
            end=Math.max(end,d);
            
        }

       
        while(start<=end){
             int mid=(start+end)/2;
                int cnt=0;
                int curlen=0;
             for(int i=0;i<n;i++){
                if(bloomDay[i]<=mid){
                    curlen++;
                    if(curlen>=k){
                        curlen=0;
                        cnt++;
                    }
                }
                else{
                    curlen=0;
                }
             }
             if(cnt>=m){
                ans=mid;
                end=mid-1;
             }
             else{
                start=mid+1;
             }
        }
        return ans;
    
    }
}