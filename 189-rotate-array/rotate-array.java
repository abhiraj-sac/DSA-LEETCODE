class Solution {
    public void rotate(int[] arr, int k) {
        int j=0;
        int n=arr.length;
        k = k % n;           // extra rotations handle
        k = n - k;
        int[] ans = new int[arr.length];
        for(int i=k;i<arr.length;i++){
            ans[j++] = arr[i];
        }
        for(int i=0;i<k;i++){
            ans[j++] = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = ans[i];
        }
    }
}