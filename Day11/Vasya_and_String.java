package ICP;

import java.util.*;
public class Vasya_and_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String s=sc.next();
        System.out.print(Math.max(count(s,'a',k),count(s,'b',k)));
    }
    public static int count(String s,char ch,int k){
        int ans=0;
        int start=0;
        int end=0;
        int flip=0;
        while(end<s.length()){
            if(s.charAt(end)!=ch){
                flip++;
            }
            while(flip>k){
                if(s.charAt(start)!=ch){
                    flip--;
                }
                start++;
            }
            ans=Math.max(ans,end-start+1);
            end++;
        }
        return ans;
    }
}
