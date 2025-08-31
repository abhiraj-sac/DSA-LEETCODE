class Solution {
    public int getLeastFrequentDigit(int n) {
        String str = String.valueOf(n);
        int[] arr = new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i] = str.charAt(i) - '0';
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
         int minfreq = Integer.MAX_VALUE; // sabse bada value rakha start mai
        int digit = -1;  
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           if(entry.getValue()< minfreq){
            minfreq = entry.getValue();
            digit = entry.getKey();
           }
        }
        return digit;
    }
}