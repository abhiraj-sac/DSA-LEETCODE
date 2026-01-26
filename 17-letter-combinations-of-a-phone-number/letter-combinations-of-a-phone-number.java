class Solution {

        public static  void help(Map<Character,String> digits,ArrayList<String> list,String p,String up){
        if(up.isEmpty()){
            list.add(String.valueOf(p));
            return;
        }
        char ch = up.charAt(0);
        int length = digits.get(ch).length();
        for(int i=0;i<length;i++){
            char c  =digits.get(ch).charAt(i);
            help(digits,list,p +c ,up.substring(1));
        }
    }
    public List<String> letterCombinations(String digits) {
         Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
        ArrayList<String> list = new ArrayList<>();
        String p = "";
        help(digitToLetters,list,p,digits);
        return list;
    }

}