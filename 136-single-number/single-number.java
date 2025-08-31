class Solution {
    public int singleNumber(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        if (n == 1) return arr[0];

        // first element unique?
        if (arr[0] != arr[1]) return arr[0];

        // last element unique?
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];

        // middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) { // AND, not OR
                return arr[i];
            }
        }
        return -1; // ideally kabhi yaha nahi aayega
    }
}
