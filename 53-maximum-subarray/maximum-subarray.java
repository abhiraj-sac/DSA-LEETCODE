class Solution {
    public int maxSubArray(int[] arr) {
       int max = Integer.MIN_VALUE; // sabse chhoti value rakho start mai
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > max) {
                max = sum;  // max update karo
            }

            if (sum < 0) {
                sum = 0;   // agar sum negative ho gaya toh reset kar do
            }
        }

        return max;
    }
}