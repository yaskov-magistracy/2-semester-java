package lr5;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/41/A
public class codeforces41a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = in.next();
        String t = in.next();
        if (s.length() != t.length()){
            out.println("NO");
            out.flush();
            return;
        }
        int length = s.length();

        String res = "YES";
        for (int i =0 ; i< length;i++){
            // смотрим на палиндром
            if (s.charAt(i) != t.charAt(length - 1 - i))
            {
                res = "NO";
                break;
            }
        }

        out.println(res);
        out.flush();
    }
}
