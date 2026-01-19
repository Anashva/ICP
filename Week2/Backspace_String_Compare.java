package Infinity_Champions_Program;

import java.util.*;
public class Backspace_String_Compare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                st1.push(s.charAt(i));
            }
            else{
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                st2.push(t.charAt(i));
            }
            else{
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }
        }
        System.out.println(String.valueOf(st1).equals(String.valueOf(st2)));
    }
}
