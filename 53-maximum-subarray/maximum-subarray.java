class Solution {
    public int maxSubArray(int[] arr) {
        int max=max=Integer.MIN_VALUE;;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum < 0){
                sum =0;
            }
            // else{/
                sum += arr[i];
                max = Math.max(max,sum);
            // }
        }
        return max;
    }
}