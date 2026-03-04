package lr3;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1785 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        String res = "";

        if (a >= 1000) {
            res = "legion";
        } else if (a >= 500) {
            res = "zounds";
        } else if (a >= 250) {
            res = "swarm";
        } else if (a >= 100) {
            res = "throng";
        } else if (a >= 50) {
            res = "horde";
        } else if (a >= 20) {
            res = "lots";
        } else if (a >= 10) {
            res = "pack";
        } else if (a >= 5) {
            res = "several";
        } else {
            res = "few";
        }

        out.println(res);
        out.flush();
    }
}
