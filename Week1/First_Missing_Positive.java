package Infinity_Champions_Program;

import java.util.*;
public class First_Missing_Positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(missing(arr));
    }
    public static int missing(int[] arr){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                flag=true;
            }
            if(arr[i]<=0 || arr[i]>arr.length){
                arr[i]=1;
            }
        }
        if(!flag){
            return 1;
        }
        for(int i=0;i<arr.length;i++){
            int idx=Math.abs(arr[i])-1;
            if(arr[idx]>0){
                arr[idx]=-arr[idx];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                return i+1;
            }
        }
        return arr.length+1;
    }
}
