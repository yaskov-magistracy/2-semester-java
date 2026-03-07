package lr5;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/281/A
public class codeforces281a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = in.next();


        // капитализируем 1 букву
        String res = s.substring(0, 1).toUpperCase() + s.substring(1);

        out.println(res);
        out.flush();
    }
}
