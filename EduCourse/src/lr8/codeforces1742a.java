package lr8;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/1742/A
public class codeforces1742a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        String[] reses = new String[n];

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c=  in.nextInt();
            boolean isOk = a == b + c
                    || b == a + c
                    || c == a + b;
            reses[i] = isOk ? "YES" : "NO";
        }

        for (String res : reses)
            out.println(res);
        out.flush();
    }
}
