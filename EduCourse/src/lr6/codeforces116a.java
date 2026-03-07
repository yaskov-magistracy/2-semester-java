package lr6;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/116/A
public class codeforces116a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int cur = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            // считаем текущий и сравниваем с максимумом
            cur -= a;
            cur += b;
            if (cur > max) {
                max = cur;
            }
        }

        out.println(max);
        out.flush();
    }
}
