package ICP;

import java.util.*;
public class Dreamoon_and_Wifi {
        static int ans=0;
        static int count=0;
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s1=sc.next();
            String s2=sc.next();
            int target=0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)=='+'){
                    target++;
                }
                else{
                    target--;
                }
            }
            count(s2,0,count,target);
            double res=(double)ans/count;
            System.out.printf("%.12f%n",res);

        }
        public static void count(String s,int j,int c,int target){
            if(j==s.length()){
                count++;
                if(c==target){
                    ans++;
                }
                return;
            }
            char ch = s.charAt(j);
            if (ch == '+') {
                count(s, j+ 1, c + 1,target);
            }
            else if (ch == '-') {
                count(s, j+ 1, c - 1,target);
            }
            else if (ch == '?') {
                count(s, j+ 1, c + 1,target);
                count(s, j+ 1, c - 1,target);
            }
        }
    }
