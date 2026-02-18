package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1000 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        // Сложение
        int res = a + b;

        out.println(res);
        out.flush();
    }
}
