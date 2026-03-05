class Solution {
    public boolean hasAlternatingBits(int n) {
 String s="";
 while(n>0){
    s=(n%2)+s;
    n=n/2;
 }
 for(int i=0;i<s.length()-1;i++){
    if(s.charAt(i)==s.charAt(i+1)){
return false;
    }
 }
 return true;
    }
}