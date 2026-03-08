package lr7;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/61/A
public class codeforces61a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        char[] s = in.next().toCharArray();
        char[] s2 = in.next().toCharArray();
        char[] res = new char[s.length];

        for (int i = 0; i < s.length; i++) {
            // не одинаковые - 1. иначе - 0
            res[i] = s[i] != s2[i]
                    ? '1'
                    : '0';
        }

        out.println(res);
        out.flush();
    }
}
