class Solution {
    public int distinctAverages(int[] arr) {
        HashSet<Double> set = new HashSet<>();
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            double avg = (arr[i] + arr[n-i-1])/2.0;
            set.add(avg);
        }
        return set.size();
    }
}