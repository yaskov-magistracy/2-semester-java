package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1209 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] res = new int[n];

        for (int i = 0; i< n;i++)
        {
            // 1 стоит в позиции если число x треугольное
            long x = in.nextInt() - 1;
            long discriminant = 1 + 8 * x;
            long root = Math.round(Math.sqrt(discriminant));

            if (root * root == discriminant) {
                res[i] = 1;
            } else {
                res[i] = 0;
            }
        }

        for (int numb : res)
            out.print(numb + " ");
        out.flush();
    }
}
