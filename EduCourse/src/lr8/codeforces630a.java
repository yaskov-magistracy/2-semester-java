package lr8;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/630/A
public class codeforces630a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long n = in.nextLong();

        // 5 в любой степени(>1) всегда кончается на 25
        System.out.println("25");
        out.flush();
    }
}
