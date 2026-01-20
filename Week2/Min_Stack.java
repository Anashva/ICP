package Infinity_Champions_Program;

import java.util.*;
public class Min_Stack {
    public static void main(String[] args) {
        
    }
    class MinStack{
        Stack<Integer> st=new Stack<>();
        Stack<Integer> mn=new Stack<>();
        public void push(int val){
            st.push(val);
            if(mn.isEmpty()){
                mn.push(val);
            }
            else{
                mn.push(Math.min(val,mn.peek()));
            }
        }
        public void pop(){
            st.pop();
            mn.pop();
        }
        public int top(){
            return st.peek();
        }
        public int getMin(){
            return mn.peek();
        }
    }

}
