class Solution {
    public int removeDuplicates(int[] arr) {
        int c=0;int a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != arr[c]){
                arr[c+1] = arr[i];
                a++;c++;
            }
        }
        return a+1;  
    }
}