class Solution {
    public void sortColors(int[] arr) {
        int n=arr.length;
        int one=0;int two=0;int zero=0;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                zero++;
            }
            else if(arr[i] == 1){
                    one++;
            }
            else{two++;}
        }
        int c=0;
        for(int i=0;i<zero;i++){arr[c++]=0;}
        for(int i=0;i<one;i++){arr[c++]=1;}
        for(int i=0;i<two;i++){arr[c++]=2;}
    }
}