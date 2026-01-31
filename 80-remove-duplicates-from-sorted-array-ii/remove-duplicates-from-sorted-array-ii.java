import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0; 
        for (int i = 0; i < nums.length; i++) {
         map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) <= 2) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
