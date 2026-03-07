package lr5;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/110/A
public class codeforces110a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = in.next();

        int count = 0;
        for (char c : s.toCharArray()) {
            // считаем "счастливые"
            if (c == '4' || c == '7')
                count++;
        }
        String res = count == 4 || count == 7
                ? "YES"
                : "NO";

        out.println(res);
        out.flush();
    }
}
