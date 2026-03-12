package lr8;

import java.io.PrintWriter;
import java.util.*;

// https://codeforces.com/problemset/problem/141/A
public class codeforces141a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = in.next();
        String s2 = in.next();
        String s3 = in.next();

        char[] togetherChars = (s + s2).toCharArray();
        char[] pileChars = s3.toCharArray();

        Arrays.sort(togetherChars);
        Arrays.sort(pileChars);

        if (Arrays.equals(togetherChars, pileChars)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        out.flush();
    }
}
