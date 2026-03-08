package lr7;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/520/A
public class codeforces520a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        String s = in.next().toLowerCase();

        // 26 в англ алфавите
        String res = s.chars().distinct().count() == 26
                ? "YES"
                : "NO";

        out.println(res);
        out.flush();
    }
}
