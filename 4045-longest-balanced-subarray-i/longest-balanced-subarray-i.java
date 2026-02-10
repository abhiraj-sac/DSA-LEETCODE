class Solution {
    public int longestBalanced(int[] arr) {
        int n=arr.length;int max=0;
        for(int i=0;i<n;i++){
            HashMap<Integer,Integer> map = new HashMap<>();
                int even=0;int odd=0;
            for(int j=i;j<n;j++){
                    if (!map.containsKey(arr[j])) {
                        if(arr[j] %2 == 0){
                            even++;
                        }
                        else{
                            odd++;
                        }
                        map.put(arr[j],1);
                    }
                
                if(odd == even) {
                    max = Math.max(max, (j - i) + 1);
                }
            }
        }
        return max;
    }
}