package lr5;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/734/A
public class codeforces734a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        String s = in.next();

        int anton = 0;
        for (char c : s.toCharArray()) {
            // достаточно считать одного из них
            if (c == 'A')
                anton++;
            else
                anton--;
        }
        String res = anton == 0
                ? "Friendship"
                : anton > 0
                    ? "Anton"
                    : "Danik";

        out.println(res);
        out.flush();
    }
}
