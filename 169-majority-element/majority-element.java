class Solution {
    public int majorityElement(int[] arr) {
        int c=0;int ele=0;
        for(int i=0;i<arr.length;i++){
            if(c == 0){
                ele=arr[i];
                c=1;
            }
            else if(arr[i] == ele){
                c++;
            }
            else{
                c--;
            }
        }
        return ele;
    }
}