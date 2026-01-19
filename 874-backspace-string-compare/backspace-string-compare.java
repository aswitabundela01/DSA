class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st=new Stack<>();
        Stack<Character>st2=new Stack<>();
        for(char c : s.toCharArray()){
            if(c!='#'){
                st.push(c);
            }else if(!st.isEmpty()){
                st.pop();
            }
        }
        for(char h  : t.toCharArray() ){
             if(h!='#'){
                st2.push(h);
            }else if(!st2.isEmpty()){
                st2.pop();
            }

        }
          return st.equals(st2) ;
    }
}