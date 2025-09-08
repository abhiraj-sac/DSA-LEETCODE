class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int count=0;
        int num=1;
        while(true){
            if(!set.contains(num)){
                count++;
            }
            if(count == k){return num;}
            num++;
        }
        
    }
}