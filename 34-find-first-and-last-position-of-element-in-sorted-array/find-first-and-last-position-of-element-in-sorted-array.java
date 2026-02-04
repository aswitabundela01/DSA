class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
 if (nums.length == 0) return result;

         int left =0;
         int right = nums.length-1;
         while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                result[0]=mid;
                right =mid-1;
            }else if(nums[mid]>target){

                right = mid-1;
            }else
            {
                left=mid+1;
            }
         }
       int   low = 0;
  int  high = nums.length - 1;

    // 🔍 Find LAST occurrence
    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            result[1] = mid;
            low = mid + 1;    // go right
        }
        else if (nums[mid] < target) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }
         return  result;
    }
}