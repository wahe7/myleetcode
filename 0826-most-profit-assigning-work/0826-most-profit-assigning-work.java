class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=difficulty.length;
        int[][] job=new int[n][2];
        for(int i=0;i<n;i++)
        {
            job[i][0]=difficulty[i];
            job[i][1]=profit[i];
        }
    int i=0,max=0,best=0;
        Arrays.sort(job,(a,b)->a[0]-b[0]);
        Arrays.sort(worker);
        for(int abl:worker){
            while(i<n && abl>=job[i][0]){
                best=Math.max(best,job[i][1]);
                i++;
            }
            max+=best;
        }
    return max;
    }
}