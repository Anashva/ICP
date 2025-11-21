package ICP;
import java.util.*;
public class Nastya_and_Rice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int l=a-b;
            int h=a+b;
            int r1=c-d;
            int r2=c+d;
            if(l*n>r2 || h*n<r1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }

        }
    }
}
