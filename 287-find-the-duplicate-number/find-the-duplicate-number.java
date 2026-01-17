class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        boolean duplicate = false;
        for(int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])) {   
                return nums[i];
            }else{
                map.put(nums[i],1);
            }
        }
        return -1;
    }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int nums[] = new int[n];
    //     for(int i =0;i<n;i++){
    //         nums[i]= sc.nextInt();
    //     }
    //     for(int i =0;i<n;i++){
    //         System.out.println(nums[i]);
    //     }
    // }
    
}
