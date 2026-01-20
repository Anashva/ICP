package Infinity_Champions_Program;


import java.util.Scanner;
import java.util.Stack;

public class Daily_Temperatures {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                ans[st.peek()]=i-st.pop();
            }
            st.push(i);
        }
        for (int  i: ans){
            System.out.print(i+" ");
        }
    }
}
