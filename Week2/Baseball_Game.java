package Infinity_Champions_Program;

import java.util.*;
public class Baseball_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]= new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            if(s.equals("+")){
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                st.push(a+b);
            }
            else if(s.equals("D")){
                int a=st.peek();
                st.push(2*a);
            }
            else if(s.equals("C")){
                st.pop();
            }
            else{
                int num=Integer.parseInt(s);
                st.push(num);
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        System.out.println(sum);
    }
}
