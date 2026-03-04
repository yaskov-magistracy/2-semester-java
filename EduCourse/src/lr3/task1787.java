package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1787 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();
        int n = in.nextInt();
        int queue = 0;
        for (int i = 0; i < n; i++) {
            int arrived = in.nextInt();
            // в итоге прибывает = прибывает - убывает
            queue = Math.max(0, queue + arrived - k);
        }

        out.println(queue);
        out.flush();
    }
}
