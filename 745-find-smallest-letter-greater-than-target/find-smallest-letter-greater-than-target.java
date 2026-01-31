class Solution {
    public char nextGreatestLetter(char[] a, char target) {
        int s = 0;
        int e = a.length - 1;
        char ans = a[0]; // default for wrap-around

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (a[mid] > target) {
                ans = a[mid];   // possible answer
                e = mid - 1;    // try to find smaller one
            } else {
                s = mid + 1;    // move right
            }
        }

        return ans;
    }
}
