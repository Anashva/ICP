package ICP;

import java.util.*;
public class Binary_String_Minimizing {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long k = sc.nextLong();
                String s = sc.next();
                char[] arr = s.toCharArray();
                int one = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '1') {
                        one++;
                    } else {
                        if (one <= k) {
                            int j = i - one;
                            arr[i] = '1';
                            arr[j] = '0';
                            k -= one;
                        } else {
                            int j = (int) (i - k);
                            arr[i] = '1';
                            arr[j] = '0';
                            break;
                        }
                    }
                }
                System.out.println(new String(arr));
            }
        }
    }
