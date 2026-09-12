class Solution {
    public static boolean isSorted(int[] array) {
        return IntStream.range(0, array.length - 1).allMatch(i -> array[i] <= array[i + 1]);
    }
    public boolean check(int[] arr) {
        int p=0;int n=arr.length;
        if(isSorted(arr)){return true;}
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                p =i+1;
                break;
            }
        }
        int[] ans = new int[n];int j=0;
        for(int i=p;i<n;i++){
        ans[j++] = arr[i];
        }       
        for(int i=0;i<p;i++){
            ans[j++] = arr[i];
        }
        return isSorted(ans);
    }
}