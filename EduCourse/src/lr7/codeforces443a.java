package lr7;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/443/A
public class codeforces443a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = in.nextLine();
        s = s.substring(1, s.length() - 1);
        long res = 0;
        if (!s.isEmpty())
            res = Arrays.stream(s.split(", ")).distinct().count();


        out.println(res);
        out.flush();
    }
}
