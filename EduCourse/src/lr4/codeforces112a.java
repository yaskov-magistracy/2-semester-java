package lr4;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/112/A
public class codeforces112a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String a = in.next();
        String b = in.next();

        int res = a.toLowerCase().compareTo(b.toLowerCase());
        // сводим к 1/-1/0
        int realRes = Integer.compare(res, 0);

        out.println(realRes);
        out.flush();
    }
}
