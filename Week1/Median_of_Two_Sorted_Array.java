package Infinity_Champions_Program;

import java.util.Scanner;

public class Median_of_Two_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
    }
    public static int median(int [] arr1,int[] arr2){
        if(arr1.length>arr2.length){
            return median(arr2,arr1);
        }
        int l=0;
        int h=arr1.length;
        int total=arr1.length+arr2.length;
        int half=(total+1)/2;
//        while(l<=h)
        return 0;
    }
}
