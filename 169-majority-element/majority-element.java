class Solution {
    public int majorityElement(int[] arr) {
        int c=0;int count=0;
        for(int i=0;i<arr.length;i++){
            if(count == 0){c=arr[i];count=1;}
            else if(arr[i] == c){count++;}
            else if(arr[i] != c){
                count--;
            }
        }
        return c;
    }
}