class Solution {
    static void permutations(List<List<Integer>> ans,
                             List<Integer> p,
                             List<Integer> up) {

        // base case
        if (up.size() == 0) {
            ans.add(new ArrayList<>(p));
            return;
        }

        int ch = up.get(0);

        for (int i = 0; i <= p.size(); i++) {

            // create new processed list
            List<Integer> newP = new ArrayList<>(p);
            newP.add(i, ch);

            // create new unprocessed list
            List<Integer> newUp = new ArrayList<>(up);
            newUp.remove(0);

            permutations(ans, newP, newUp);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> up = Arrays.stream(nums)
                         .boxed()
                         .toList();
                List<Integer> p = new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();

        permutations(ans, p, up);
        return ans;
    }
}