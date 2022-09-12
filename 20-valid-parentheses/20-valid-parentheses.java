class Solution {
    public boolean isValid(String s) {
        Stack <Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
            st.push(s.charAt(i));
            else
            {
                if(st.size()==0)
                return false;
                else
                { char c=st.pop();
                    if(c=='('&&s.charAt(i)==')'||c=='{'&&s.charAt(i)=='}'||c=='['&&s.charAt(i)==']')
                    continue;
                    else return false;
                }
            }

        }
        if(st.size()!=0)
        return false;
        else return true;
    }
}