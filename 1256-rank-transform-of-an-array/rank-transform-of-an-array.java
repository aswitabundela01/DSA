class Solution {
    public int[] arrayRankTransform(int[] nums) {
        int result[]= new int [nums.length];
    int temp[]=new int[nums.length];
    for(int i=0;i<nums.length;i++){
         temp[i]= nums[i];
    }
    Arrays.sort(temp);
   Map<Integer,Integer>map= new HashMap<>();
   int rank =1;
   for(int i =0;i<nums.length;i++){
    if(!map.containsKey(temp[i])){
        map.put(temp[i],rank);
        rank++;
    }
   }
        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }

        return result;
    }
}