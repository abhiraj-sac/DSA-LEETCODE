class Solution {
    public String removeKdigits(String num, int k) {
    Stack<Character> st = new Stack<>();

for (int i = 0; i < num.length(); i++) {
    char ch = num.charAt(i);

    // peeche wale jitne bade digits hain, unko hatao
    while (k > 0 && !st.isEmpty() && st.peek() > ch) {
        st.pop();
        k--;
    }

    st.push(ch);
}

// agar abhi bhi k bacha hai, to right se digits hataa do
while (k > 0 && !st.isEmpty()) {
    st.pop();
    k--;
}

// stack se string banao (reverse order)
StringBuilder sb = new StringBuilder();
while (!st.isEmpty()) {
    sb.append(st.pop());
}
sb.reverse();

String result = sb.toString();

// leading zeros hatao
result = result.replaceFirst("^0+(?!$)", "");
if (result.isEmpty()) return "0";
return result;
}
}