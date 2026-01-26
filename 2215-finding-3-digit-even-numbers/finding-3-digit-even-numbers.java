class Solution {
    public int[] findEvenNumbers(int[] digits) {
   Set<Integer> set = new HashSet<>();
   for(int i =0;i<digits.length;i++){
    if(digits[i]==0)continue;
        for(int j =0;j<digits.length;j++){
            if(i==j)continue;
            for(int k=0;k<digits.length;k++){
                if(k==i||k==j) continue;
                if(digits[k]%2!=0) continue;

                int sum = digits[i]*100+digits[j]*10+digits[k];
                set.add(sum);
            }
        }
   }
    int[] result = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            result[idx++] = num;
        }

        Arrays.sort(result);

        return result;
    }

}