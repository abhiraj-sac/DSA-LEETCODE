class Solution {
            void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    public void moveZeroes(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
           while(i<j && arr[i] != 0){i++;}
           if(arr[i] == 0 && arr[j] != 0){
            swap(arr,i,j);
            i++;
           }
        }
    }
}