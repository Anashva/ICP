package Infinity_Champions_Program;

import java.util.*;
public class Delete_Middle_Element_of_a_Stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        while(n-->0){
            int x=sc.nextInt();
//            System.out.print(x+" ");
            st.push(x);
        }
//        System.out.println();
        int size=st.size();
        middle(st,size);
        
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }

    }
    public static  void middle(Stack<Integer> st,int size){
        ArrayList<Integer> ll=new ArrayList<>();
        while(!st.isEmpty()){
            ll.add(st.pop());
        }
        int m=size/2;
        ll.remove(m);
        Collections.reverse(ll);
        for(int i:ll){
            st.push(i);
        }

    }
}
