package lr4;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/50/A
public class codeforces50a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int m = in.nextInt();
        int n = in.nextInt();

        // каждая домношка занимает 2 квадратных размера
        int res = m * n / 2;

            out.println(res);
        out.flush();
    }
}
