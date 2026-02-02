class Solution {
    public int maxPower(String s) {
        // HashMap<Character,Integer> map = new HashMap<>();
        // for(int i =0;i>=s.length()-1;i++){
        //     map.put(s.charAt(i),map.getOrDefault(nums[i]))
        // }
            if (s.length() == 0) return 0;
        int count=1;
        int maxCount =1;
        for(int i =0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count ++;
                maxCount = Math.max(maxCount,count);
            }else{
                count =1;
            }

        }
        return maxCount;
    }
}