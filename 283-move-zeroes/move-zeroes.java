class Solution {
    public static void swap(int[] arr, int i,int c){
        int temp = arr[i];
        arr[i] = arr[c];
        arr[c] = temp;
    }
    
    public void moveZeroes(int[] arr) {
       int c=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i] != 0){
            swap(arr,i,c);
            c++;
        }
       } 
    }
}