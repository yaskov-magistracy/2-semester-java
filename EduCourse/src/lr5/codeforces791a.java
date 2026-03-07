package lr5;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/791/A
public class codeforces791a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int res = 0;
        // считаем
        while (a <= b) {
            a *= 3;
            b *= 2;
            res++;
        }

        out.println(res);
        out.flush();
    }
}
