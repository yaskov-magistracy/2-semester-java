package lr7;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/705/A
public class codeforces705a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i< n;i++){
            String curPhrase = i % 2 == 0
                    ? "I hate "
                    : "I love ";
            String suffix = i == n - 1
                    ? "it "
                    : "that ";
            res.append(curPhrase + suffix);
        }

        out.println(res.toString());
        out.flush();
    }
}
