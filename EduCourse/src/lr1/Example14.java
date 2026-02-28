package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int num = in.nextInt();

        int numMinus1 = num - 1;
        int numPlus1 = num + 1;

        int sum = numMinus1 + num + numPlus1;
        int square = sum * sum;

        System.out.println("Numbers: " + numMinus1 + ", " + num + ", " + numPlus1 + ", " + square);
        in.close();
    }
}
