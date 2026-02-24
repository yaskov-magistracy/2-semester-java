package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1110 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();
        int y = in.nextInt();

        StringBuilder sb = new StringBuilder();
        boolean found = false;

        for (int x = 0; x < m; x++) {
            long res = 1;
            long base = x;
            int exp = n;

            // быстрое модульное возведение в степень
            while (exp > 0) {
                if (exp % 2 == 1) {
                    res = (res * base) % m;
                }
                base = (base * base) % m;
                exp /= 2;
            }

            if (res == y) {
                sb.append(x + " ");
                found = true;
            }
        }

        String res;
        if (found) {
            res = sb.toString().trim();
        } else {
            res = "-1";
        }

        out.println(res);
        out.flush();
    }
}
