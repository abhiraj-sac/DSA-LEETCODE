class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int i=0;int j=0;
        double avg=0;
        double sum=0;
        double max=Integer.MIN_VALUE;
        if(arr.length == 1 && k==1){return (double)arr[0];}
        while(j<arr.length){
            sum += arr[j];
            if((j-i+1) < k){
                j++;
            }
            else if((j-i+1) == k){
                avg = (double) sum / k;
                max = Math.max(max,avg);
                sum -= arr[i];
                i++;j++;
            }
        }
        return max;
    }
}