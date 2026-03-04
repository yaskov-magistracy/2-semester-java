package lr4;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/4/A
public class codeforces4a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();

        // обоим нужен чёт => само число тоже чётное
        // 2 не подойдёт, тк получается 1/1
        String res = a > 2 && a % 2 == 0 ? "YES" : "NO";

        out.println(res);
        out.flush();
    }
}
