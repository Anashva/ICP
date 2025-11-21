package ICP;

import java.util.*;
public class Transformation_from_A_to_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        List<Long> sequence = new ArrayList<>();
        sequence.add(b);
        while (b > a) {
            if (b % 10 == 1) {
                b = (b - 1) / 10;
                sequence.add(b);
            } else if (b % 2 == 0) {
                b /= 2;
                sequence.add(b);
            } else {
                break;
            }
        }

        if (b != a) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            Collections.reverse(sequence);
            System.out.println(sequence.size());
            for (long x : sequence) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
