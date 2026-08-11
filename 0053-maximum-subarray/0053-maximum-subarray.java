class Solution {
    public int maxSubArray(int[] arr) {
        int sum =0;int max=Integer.MIN_VALUE;;
        for(int i=0;i<arr.length;i++){
            if(sum <0){
                sum=0;
            }
            sum += arr[i];
            max =Math.max(max,sum);
        }
        return max;


    }
}