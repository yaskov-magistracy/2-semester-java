package lr2;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1349 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        String res;
        if (n == 1) {
            res = "1 2 3";
        } else if (n == 2) {
            res = "3 4 5";
        } else {
            res = "-1";
        }

        out.println(res);
        out.flush();
    }
}
