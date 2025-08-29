class Solution {
    public static boolean isSorted(int[] array) {
        return IntStream.range(0, array.length - 1).allMatch(i -> array[i] <= array[i + 1]);
    }
    public boolean check(int[] arr) {
        int point=0;
        if(isSorted(arr)){return true;}
        int n =arr.length;
        // if(n >= 2 && arr[n-1] < arr[n-2]){}

        for(int i=1;i<n;i++){
            if( arr[i] < arr[i-1]){
                point = i;
                break;
            }
        }
        int[] a = new int[n];
    int k = 0;

    // point ke baad wale elements daalo
    for (int i = point; i < n; i++) {
        a[k++] = arr[i];
    }

    // fir point se pehle wale daalo
    for (int i = 0; i < point; i++) {
        a[k++] = arr[i];
    }
        if(isSorted(a)){
            return true;
        }
        return false;
    }

}