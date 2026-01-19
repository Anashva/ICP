package Infinity_Champions_Program;

import java.util.*;
public class Valid_Parenthesis_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(valid(s));
    }
    public static boolean valid(String s){
        Stack<Integer> st=new Stack<>();
        Stack<Integer> star=new Stack<>();
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else if(s.charAt(i)=='*'){
                star.push(i);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else if(!star.isEmpty()){
                    star.pop();
                }
                else if(st.isEmpty() && star.isEmpty()){
                    return false;
                }
            }
        }
        while(!st.isEmpty() && !star.isEmpty()){
            if(st.peek()>star.peek()){
                return false;
            }
            st.pop();
            star.pop();
        }
        return st.isEmpty();
    }
}
