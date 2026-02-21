package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2001 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();

        // вес у первого - изеначальный минус вес корзины
        int m1 = a1 - a3;
        // вес у второго - изначальный мину вес корзины
        int m2 = b1 - b2;

        out.println(m1 + " " + m2);
        out.flush();
    }
}
