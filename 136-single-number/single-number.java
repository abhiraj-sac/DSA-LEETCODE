class Solution {
    public int singleNumber(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        if(n==1){
            return arr[0];
        }
        if(n > 1 && arr[0] != arr[1]){
            return arr[0];
        }
        if(n > 1 && arr[n-1] != arr[n-2]){
            return arr[n-1];
        }
        for(int i=1;i<n-1;i++){
            if(arr[i-1] != arr[i] && arr[i+1] != arr[i]){
                return arr[i];
            }
        }
      return -1;
    }
}
