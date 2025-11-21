package ICP;

import java.util.*;
public class Remove_All_Adjacent_Duplicates_in_String_II {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        Stack<Integer> count = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!st.isEmpty() && s.charAt(i) == st.peek()) {
                count.push(count.pop() + 1);
            } else {
                st.push(s.charAt(i));
                count.push(1);
            }
            if (count.peek() == k) {
                st.pop();
                count.pop();
            }
        }
            while (!st.isEmpty()) {
                int n = count.pop();
                char ch = st.pop();
                for (int i = 0; i < n; i++) {
                    sb.append(ch);
                }
            }
            sb.reverse();
            return sb.toString();
        }
}
