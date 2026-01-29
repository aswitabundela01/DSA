class Solution {

   
    public int lengthOfLastWord(String s){
        boolean started = false;
int count =0;
for(int i=s.length()-1;i>=0;i--){
    if(s.charAt(i)!=' '){
        started = true;
count++;
    }else if (started) {
        break;
    }
}
    return count;
    }
}