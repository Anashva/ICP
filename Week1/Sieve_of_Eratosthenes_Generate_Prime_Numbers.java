package Infinity_Champions_Program;

import java.util.*;
public class Sieve_of_Eratosthenes_Generate_Prime_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(count_prime(n));
    }
    public static int count_prime(int n){
        if(n<2){
            return 0;
        }
        int[] arr=new int[n];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i*i<arr.length;i++){
            if(arr[i]==0){
                for(int j=2;i*j<arr.length;j++){
                    arr[i*j]=1;
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                c++;
            }
        }
        return c;
    }
}
