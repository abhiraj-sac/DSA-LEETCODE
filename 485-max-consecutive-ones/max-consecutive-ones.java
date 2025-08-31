class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int c=0;
        int maxs=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                c++;
            }
            else{
                maxs = Math.max(maxs,c);
                c=0;
            }
        }
        return Math.max(maxs,c);
    }
}