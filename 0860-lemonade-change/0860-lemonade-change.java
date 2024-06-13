class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        
        int sum=0,tsum=0;
        
        for(int i=0;i<n;i++){
            if(bills[i]==5){
                sum+=5;
            }
            else if(bills[i]==10){
                if(sum>=5){
                    sum-=5;
                }
                else{
                    return false;
                }
                tsum+=10;
            }
            else if(bills[i]==20){
                if(sum>=5 && tsum>=10){
                    sum-=5;
                    tsum-=10;
                }
                else if(sum>=15){
                    sum-=15;
                    
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}