package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1068 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        // арифм. прогрессия
        int result;
        if (n >= 1) {
            result = (1 + n) * n / 2;
        } else {
            // n <= 1, то количество элементов равно (2 - n)
            result = (1 + n) * (2 - n) / 2;
        }

        out.println(result);
        out.flush();
    }
}
