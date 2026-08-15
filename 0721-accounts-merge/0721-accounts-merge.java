// class Solution {
//     public List<List<String>> accountsMerge(List<List<String>> accounts) {
        
//     }
// }


class Solution {

    int[] parent;

    int find(int x) {
        if (parent[x] == x) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);

        if (pa != pb) {
            parent[pb] = pa;
        }
    }

    public List<List<String>> accountsMerge(
            List<List<String>> accounts) {

        // email -> unique id
        HashMap<String, Integer> map = new HashMap<>();

        // email -> person's name
        HashMap<String, String> emailName = new HashMap<>();

        int id = 0;

        // 1. Give every email a unique ID
        for (List<String> account : accounts) {

            String name = account.get(0);

            for (int i = 1; i < account.size(); i++) {

                String email = account.get(i);

                if (!map.containsKey(email)) {
                    map.put(email, id++);
                    emailName.put(email, name);
                }
            }
        }

        // 2. Initialize DSU
        parent = new int[id];

        for (int i = 0; i < id; i++) {
            parent[i] = i;
        }

        // 3. Merge emails belonging to same account
        for (List<String> account : accounts) {

            int firstEmailId = map.get(account.get(1));

            for (int i = 2; i < account.size(); i++) {

                int currentEmailId = map.get(account.get(i));

                union(firstEmailId, currentEmailId);
            }
        }

        // 4. Group emails according to parent
        HashMap<Integer, List<String>> groups = new HashMap<>();

        for (String email : map.keySet()) {

            int emailId = map.get(email);

            int root = find(emailId);

            groups
                .computeIfAbsent(root, k -> new ArrayList<>())
                .add(email);
        }

        // 5. Build answer
        List<List<String>> result = new ArrayList<>();

        for (List<String> emails : groups.values()) {

            Collections.sort(emails);

            String name = emailName.get(emails.get(0));

            List<String> account = new ArrayList<>();

            account.add(name);
            account.addAll(emails);

            result.add(account);
        }

        return result;
    }
}