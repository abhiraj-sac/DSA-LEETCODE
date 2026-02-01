class Solution {
    public int minimumCost(int[] arr) {
        if(arr.length == 3){
            return arr[0]+arr[1]+arr[2];
        }
        int base = arr[0];
        Arrays.sort(arr);
        int one  = arr[0];
        int two= arr[1];
        if(base == one || base ==two){
            return one+two+arr[2];
        }
        return one +two+base;
    }
}