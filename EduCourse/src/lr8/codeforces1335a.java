package lr8;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/1335/A
public class codeforces1335a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        long[] res = new long[n];

        for (int i = 0; i < n; i++) {
            long cur = in.nextLong();
            // можем брать от половины до максимума - 1
            res[i] = (cur - 1) / 2;
        }

        for (long i : res)
            out.println(i);
        out.flush();
    }
}
