package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon_1271 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger(); //BigInteger은 문자열이므로 사칙연산이 안됨. BigInteger 클래스 내부의 메서드 사용
        BigInteger m = sc.nextBigInteger();

        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));

        sc.close();

    }
}
