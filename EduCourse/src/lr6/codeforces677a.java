package lr6;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/677/A
public class codeforces677a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int h = in.nextInt();

        int res = 0;
        for (int i = 0; i< n;i++)
        {
            int a = in.nextInt();
            // смотрим кому нужно пригибаться
            res += a > h ? 2 : 1;
        }

        out.println(res);
        out.flush();
    }
}
