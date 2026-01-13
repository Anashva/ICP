package Infinity_Champions_Program;

import java.util.*;
public class Sum3_Find_All_Unique_Triplets_That_Sum_to_Zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        List<List<Integer>> ll=new ArrayList<>();
        sum3(arr,ll);
        System.out.println(ll);
    }
    public static void sum3(int[] arr,List<List<Integer>> ll){
        int i=0;
        int n=arr.length;
        while(i<n-3){
            int left=i+1;
            int right=n-1;
            if(i>0 && arr[i-1]==arr[i]){
                continue;
            }
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==0){
                    ll.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                    while(left<right && arr[left]==arr[left-1]){
                        left++;
                    }
                    while(right>left && arr[right]==arr[right+1]){
                        right--;
                    }
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right++;
                }
                i++;
            }
        }
    }
}
