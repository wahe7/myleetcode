class Solution {

    public static boolean check(int[] p,int mid,int m){
        int prev=p[0];int cnt=1;
        for(int i=1;i<p.length;i++)
        {
            if(p[i]-prev>=mid){
                prev=p[i];
                cnt++;
            }
        }
        return cnt >= m;
    }
    public int maxDistance(int[] position, int m) {
        
            int n=position.length;
             Arrays.sort(position);
            int s=0;
            int e=position[n-1];
           
       
        int ans=-1;
     
        while(s<=e){
           int mid=(s+e)/2;

           if(check(position,mid,m))
           {
            ans=mid;
            s=mid+1;
           }
           else{
            e=mid-1;
           }
        }

        return ans;
   
            
        
    }
    
}