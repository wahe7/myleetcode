class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n%2!=0){
            return false;
        }
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='('){
                st.push(')');
            }
             else if(s.charAt(i)=='{'){
                st.push('}');
            }
            else if(s.charAt(i)=='['){
                st.push(']');
            }
            else if(s.charAt(i)==')')
            {
                if(st.isEmpty()){
                    return false;
                }
                if(st.peek()==')')
                {
                    st.pop();
                    
                }
                else{
                    return false;
                }
            }
           else if(s.charAt(i)=='}')
            {
               if(st.isEmpty()){
                    return false;
                }
                if(st.peek()=='}')
                {
                    st.pop();
                    
                }
                   else{
                    return false;
                }
            }
                        else if(s.charAt(i)==']')
            {
                            if(st.isEmpty()){
                    return false;
                }
                if(st.peek()==']')
                {
                    st.pop();
                    
                }
                                else{
                    return false;
                }
            }
        }
        
        if(!st.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
}