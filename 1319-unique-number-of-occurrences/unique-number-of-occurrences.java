class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // github1
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> sub:map.entrySet()){
            if(al.contains(sub.getValue())){
                return false;
            }
            else{
                al.add(sub.getValue());
            }
        }
        return true;
    } 
}