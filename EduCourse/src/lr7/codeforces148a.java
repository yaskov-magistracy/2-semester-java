package lr7;

import java.io.PrintWriter;
import java.util.*;

// https://codeforces.com/problemset/problem/148/A
public class codeforces148a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();
        int l = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int d = in.nextInt();

        int res = 0;

        for (int i = 1; i <= d; i++) {
            // пострадал = делится зоть на одно число
            if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
                res++;
            }
        }

        out.println(res);
        out.flush();
    }
}
