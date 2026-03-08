package lr7;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/1328/A
public class codeforces1328a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            res[i] = a % b == 0
                    ? 0
                    // чудеса математики
                    : b * (a / b + 1) - a;
        }

        for (int cur : res)
            out.println(cur);
        out.flush();
    }
}
