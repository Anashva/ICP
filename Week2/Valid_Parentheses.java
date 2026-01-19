package Infinity_Champions_Program;

import java.util.*;

public class Valid_Parentheses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()) {
                if ((s.charAt(i) == ')' && st.peek() == '(') || (s.charAt(i) == ']' && st.peek() == '[') || (s.charAt(i) == '}' && st.peek() == '{')) {
                    st.pop();
                    continue;
                }
            }
            st.push(s.charAt(i));

        }
        System.out.println(st.isEmpty());
    }
}
