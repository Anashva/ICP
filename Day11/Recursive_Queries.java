package ICP;

import java.util.*;
public class Recursive_Queries {
    static final int MAX = 1000000;
    static int[][] pref = new int[10][MAX + 1];
    static int[] g = new int[MAX + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= MAX; i++) {
            g[i] = (int) fun(i);
        }
        for (int k = 1; k <= 9; k++) {
            for (int j = 1; j <= MAX; j++) {
                pref[k][j] = pref[k][j - 1] + (g[j] == k ? 1 : 0);
            }
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(pref[k][r] - pref[k][l - 1]);
        }
    }

    public static long pro(long n) {
        long p = 1;
        while (n > 0) {
            long d = n % 10;
            if (d != 0) p *= d;
            n /= 10;
        }
        return p;
    }

    public static long fun(long n) {
        if (n < 10) return n;
        return fun(pro(n));
    }
}
