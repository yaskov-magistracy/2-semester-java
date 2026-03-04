package lr2;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1083 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int k = in.next().length();
        int res = 1;
        while (n > 0) {
            res *= n;
            n -= k;
        }

        out.println(res);
        out.flush();
    }
}
