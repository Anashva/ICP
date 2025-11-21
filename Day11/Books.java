package ICP;

import java.util.*;
public class Books {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int t=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(bs(arr,t));

        }
        public static int bs(int[] arr,int t){
            int start=0;
            int end=0;
            int sum=0;
            int ans=0;
            while(end<arr.length){
                sum+=arr[end];
                while(sum>t){
                    sum-=arr[start];
                    start++;
                }
                ans=Math.max(ans,end-start+1);
                end++;
            }
            return ans;
        }

    }
