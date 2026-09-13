class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b) -> a[0]- b[0]);
        ArrayList<int[]> list= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(list.isEmpty() ||arr[i][0] >  list.get(list.size()-1)[1]){
                list.add(arr[i]);
            }
            else{
                list.get(list.size()-1)[1] = Math.max(arr[i][1] , list.get(list.size()-1)[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}