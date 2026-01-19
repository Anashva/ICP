package Infinity_Champions_Program;

import java.util.*;
public class Remove_Outermost_Parentheses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(!st.isEmpty()){
                    sb.append(s.charAt(i));
                }
                st.push(s.charAt(i));
            }
            else {
                st.pop();
                if(!st.isEmpty()){
                    sb.append(s.charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}
