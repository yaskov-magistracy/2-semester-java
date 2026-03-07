package lr6;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/467/A
public class codeforces467a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int res = 0;

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            // вмещает ли комната ещё 2 челоевк
            if (b - a - 2 >= 0)
                res++;
        }

        out.println(res);
        out.flush();
    }
}
