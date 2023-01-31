package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon_5988 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i<num; i++) {

            BigInteger a = sc.nextBigInteger();

            System.out.println(a.remainder(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0)) ? "even" : "odd");
        }
    }
}
