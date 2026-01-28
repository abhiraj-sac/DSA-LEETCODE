class Solution {
    public void help(int ind,String s,ArrayList<List<String>> res,ArrayList<String> path){
     if(ind == s.length()){
        res.add(new ArrayList<>(path));
        return;
     }
     for(int i=ind;i<s.length();i++){
        if(isPalindrome(s,ind,i)){
            path.add(s.substring(ind,i+1));
            help(i+1,s,res,path);
            path.remove(path.size()-1);
        }
     }

    }
    public List<List<String>> partition(String s) {
        ArrayList<List<String>> res  =new ArrayList<>();
        ArrayList<String> path  =new ArrayList<>();
        help(0,s,res,path);
        return res;
    }
    boolean isPalindrome(String s, int start, int end) {
    while (start < end) {
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        start++;
        end--;
    }
    return true;
}
}