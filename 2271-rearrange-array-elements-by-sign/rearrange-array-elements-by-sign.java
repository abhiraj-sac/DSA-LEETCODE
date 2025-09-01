class Solution {
    public int[] rearrangeArray(int[] arr) {
        int[] p = new int[arr.length/2];
        int[] n = new int[arr.length/2];
        int[] r = new int[arr.length];
        int s=0;int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0){
                p[s++] = arr[i];
            }
            else{
                n[j++] = arr[i];
            }
        }
        s=0;j=0;
        for(int i=0;i<arr.length;i++){
            if(i %2 == 0){
                r[i] = p[s++];
            }
            else{
                r[i] = n[j++];
            }
        }
        return r;
    }
}