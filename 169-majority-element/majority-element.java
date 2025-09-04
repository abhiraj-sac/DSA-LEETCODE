class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i] , map.getOrDefault(arr[i],0)+1);
        }
        int num=0;
        for(Map.Entry<Integer,Integer> sub:map.entrySet()){
            if(sub.getValue() > (arr.length/2)){
                num = sub.getKey();
            }
        }
        return num;
    }
}