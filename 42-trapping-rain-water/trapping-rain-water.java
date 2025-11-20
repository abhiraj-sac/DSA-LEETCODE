class Solution {
    static int trap(int[] arr) {
        int l = 0, r = arr.length - 1;
        int lmax = 0, rmax = 0;
        int t = 0; // total water

        while (l < r) {
            if (arr[l] <= arr[r]) { // left side chhoti ya equal
                if (arr[l] >= lmax) {
                    lmax = arr[l];  // new left max
                } else {
                    t += lmax - arr[l];  // water add
                }
                l++;
            } else { // right side chhoti
                if (arr[r] >= rmax) {
                    rmax = arr[r];  // new right max
                } else {
                    t += rmax - arr[r];  // water add
                }
                r--;
            }
        }
        return t;
    }
}
