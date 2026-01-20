class Solution {
    public int maxArea(int[] height) {
      
        int maxWater = 0; 
        int i =  0;
        int j =height.length-1;
        while(i<j){

            int ht = Math.min(height[i], height[j]);  
                int width = j - i;                        
                int curr = ht * width;                    
                maxWater = Math.max(maxWater, curr);
              

                      if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        

        // for (int i = 0; i < height.length; i++) {          // B: pick left wall i
        //     for (int j = i + 1; j < height.length; j++) {  // C: pick right wall j
        //         int ht = Math.min(height[i], height[j]);  // D: limiting height
        //         int width = j - i;                         // E: distance
        //         int curr = ht * width;                     // F: area
        //         maxWater = Math.max(maxWater, curr);       // G: max so far
        //     }
        // }
        return maxWater;                                   // H: final answer
    }
}
