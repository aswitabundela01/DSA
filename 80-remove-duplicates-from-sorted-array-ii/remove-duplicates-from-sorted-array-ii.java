import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {

        int k = 1;
        int count =1;
        for(int i =1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count ++;

            }else{
                count=1;
            }

        
if(count<=2){
    nums[k]= nums[i];
    k++;
}

        }

return k;



        // HashMap<Integer, Integer> map = new HashMap<>();
        // int index = 0; 
        // for (int i = 0; i < nums.length; i++) {
        //  map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        //     if (map.get(nums[i]) <= 2) {
        //         nums[index] = nums[i];
        //         index++;
        //     }
        // }

        // return index;
    }
}
