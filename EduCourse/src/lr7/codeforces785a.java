package lr7;

import java.io.PrintWriter;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/785/A
public class codeforces785a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int res = 0;
        
        for (int i = 0; i< n;i++)
        {
            String cur = in.next();
            // просто сравниваем
            if (cur.equals("Tetrahedron")) {
                res += 4;
            } else if (cur.equals("Cube")) {
                res += 6;
            } else if (cur.equals("Octahedron")) {
                res += 8;
            } else if (cur.equals("Dodecahedron")) {
                res += 12;
            } else if (cur.equals("Icosahedron")) {
                res += 20;
            }
        }

        out.println(res);
        out.flush();
    }
}
