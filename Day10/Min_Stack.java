package ICP;

import java.util.*;
public class Min_Stack {
    class MinStack {
        int min=Integer.MAX_VALUE;
        Stack<Integer> st=new Stack<>();
        Stack<Integer> mst=new Stack<>();
        public void push(int val) {
            st.push(val);
            if(mst.isEmpty()){
                mst.push(val);
            }
            else{
                mst.push(Math.min(val, mst.peek()));
            }
        }

        public void pop() {
            st.pop();
            mst.pop();
        }

        public int top() {
            return st.peek();
        }

        public int getMin() {
            return mst.peek();
        }
    }

}
