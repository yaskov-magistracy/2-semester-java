package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1243 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = in.next();

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            // сдвигаем текущий остаток на разряд влево, добавляем цифру и берем остаток от деления на 7
            res = (res * 10 + digit) % 7;
        }

        out.println(res);
        out.flush();
    }
}
