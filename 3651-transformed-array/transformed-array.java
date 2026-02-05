class Solution {
    public int[] constructTransformedArray(int[] arr) {
        int n =arr.length;int j=0;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
         if(arr[i] > 0){
            res[i] = arr[ (i +arr[i])%n];
         }
         else if(arr[i]==0){
            res[i] = arr[i];
         }
         else{
            res[i] =arr[(n+(i+(arr[i]))%n) % n];
         }
        }
        return res;
    }
}