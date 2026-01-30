package StringsJava;

import java.util.Stack;

public class ValidParenthesess {
    public static void main(String[] args) {
        String s = "([)]"; // "([)]"

        if(s.length() == 0) System.out.println("true");
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            } else {
                switch (s.charAt(i)){
                    case ')':
                        if (st.peek().equals('(')){
                            st.pop();
                            break;
                        }else {
                            System.out.println("false");
                            break;
                        }
                    case ']':
                        if (st.peek().equals('[')){
                            st.pop();
                            break;
                        }else {
                            System.out.println("false");
                            break;
                        }
                    case '}':
                        if (st.peek().equals('{')){
                            st.pop();
                            break;
                        }else {
                            System.out.println("false");
                            break;
                        }
                }
            }
        }
        if (st.isEmpty()) System.out.println("true");
        else System.out.println("false");
    }
}
