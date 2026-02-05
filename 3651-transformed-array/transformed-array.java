class Solution {
    public int[] constructTransformedArray(int[] nums) {
       

        int n = nums.length;
        int result[]= new int[n];
        for(int i =0;i<n;i++){
              int steps = nums[i];
            // circular index movement
            int newIndex = ((i + steps) % n + n) % n;

            result[i] = nums[newIndex];
            }
        
        return result;
    }
}