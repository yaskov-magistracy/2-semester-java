package lr8;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/723/A
public class codeforces723a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int[] nums = new int[3];
        nums[0] = in.nextInt();
        nums[1] = in.nextInt();
        nums[2] = in.nextInt();

        Arrays.sort(nums);
        // минимальный всегда средний между тремя
        int res = nums[2] - nums[1]
                + nums[1] - nums[0];

        System.out.println(res);
        out.flush();
    }
}
