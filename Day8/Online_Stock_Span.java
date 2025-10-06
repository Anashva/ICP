package ICP;

import java.util.*;
public class Online_Stock_Span {
    Stack<int[]> st;//for storing price and its span
    public Online_Stock_Span() {
        st=new Stack<>();
    }

    public int next(int price) {
        int c=1;
        while(!st.isEmpty() && st.peek()[0]<=price){
            c+=st.pop()[1];

        }
        st.push(new int[]{price,c});
        return st.peek()[1];
    }
}
