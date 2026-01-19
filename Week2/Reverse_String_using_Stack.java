package Infinity_Champions_Program;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_String_using_Stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        System.out.println(sb.toString());
    }
}
