class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String sarr[]=s.split(" ");
        int n=pattern.length();
        if(n!=sarr.length)
        {
            return false;
        }
        HashMap<Character,String>map=new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            char c=pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(sarr[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(sarr[i]))
                {
                    return false;
                }
                map.put(c,sarr[i]);
            }
        }
        
        return true;
        
    }
}