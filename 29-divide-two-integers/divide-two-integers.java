class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
    return Integer.MAX_VALUE;  // handle overflow case explicitly
}

        int sum = dividend /divisor;
        String str = String.valueOf(sum);

 for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        return (int)sum;
    }
}