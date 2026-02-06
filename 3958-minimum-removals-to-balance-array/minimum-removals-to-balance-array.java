class Solution {
    public int minRemoval(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;

        int l = 0;
        int ans = n;  // worst case: sab hatao

        for (int r = 0; r < n; r++) {

            // jab tak window invalid hai, left badhao
            while ((long) arr[r] > (long) k * arr[l]) {
                l++;
            }

            int windowSize = r - l + 1;
            ans = Math.min(ans, n - windowSize);
        }

        return ans;
    }
}
