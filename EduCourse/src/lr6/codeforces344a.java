package lr6;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/344/A
public class codeforces344a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int res = 0;
        int last = 0;

        for (int i = 0; i < n; i++) {
            int cur = in.nextInt();
            // островки формируются если приложили одинаковые полюса
            if (cur != last)
                res++;

            last = cur;
        }

        out.println(res);
        out.flush();
    }
}
