class Solution {
    public int minOperations(String s) {
        int temp =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'!=i%2){
                temp++;
            }
        }
        return Math.min(temp,s.length()-temp);
    }
}