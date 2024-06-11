class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int arr[]=new int[n];
        int m=arr2.length;
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr1[j]==arr2[i]){
                    arr[k]=arr1[j];
                    k++;
                    arr1[j]=-1;
                    
                }
            }
        }
        ArrayList<Integer>l=new ArrayList<>();
    
      
            for(int i=0;i<n;i++){
                if(arr1[i]!=-1){
                    l.add(arr1[i]);
                }
            }
        
        Collections.sort(l);
        
        for(int i=0;i<l.size();i++)
        {
            arr[k]=l.get(i);
            k++;
        }
        return arr;
    }
}