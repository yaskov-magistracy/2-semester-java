package lr2;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1197 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] res = new int[n];

        // ходы коня
        int[][] moves = {
                {-2, -1}, {-2, 1}, {-1, -2}, {-1, 2},
                {1, -2}, {1, 2}, {2, -1}, {2, 1}
        };

        for (int i = 0; i < n; i++) {
            String pos = in.next();
            int x = pos.charAt(0) - 'a';
            int y = pos.charAt(1) - '1';

            int count = 0;
            for (int[] move : moves) {
                int newX = x + move[0];
                int newY = y + move[1];
                if (newX >= 0 && newX < 8 && newY >= 0 && newY < 8) {
                    count++;
                }
            }

            res[i] = count;
        }

        for(int count : res)
            out.println(count);
        out.flush();
    }
}
