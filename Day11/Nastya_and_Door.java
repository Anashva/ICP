package ICP;

import java.util.*;
public class Nastya_and_Door {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int ans=0;
            int d=1;
            int c=0;
            int[] pre=new int[n];
            for(int i=1;i<n-1;i++){
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    pre[i]=1;
                }
            }
            for(int i=1;i<k-1;i++){
                c+=pre[i];
            }
            ans=c;
            for(int i=1;i+k-1<n;i++){
                c-=pre[i];
                c+=pre[i+k-2];
                if(c>ans){
                    ans=c;
                    d=i+1;
                }
            }
            System.out.println((ans+1)+" "+d);
        }
    }
}
