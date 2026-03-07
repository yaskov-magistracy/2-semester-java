package lr6;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/1030/A
public class codeforces1030a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        String res = "EASY";
        for (int i = 0; i < n;i++)
        {
            // хоть 1
            if (in.nextInt() == 1)
                res = "HARD";
        }

        out.println(res);
        out.flush();
    }
}
