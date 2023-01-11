package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Baekjoon_1247 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcasenum = 3;

        for (int i = 0; i < testcasenum; i++) {
            int size = Integer.parseInt(br.readLine());
            BigInteger bi = new BigInteger("0"); // BigInteger을 초기화하기 위해서는 문자열을 인자 값으로 넘겨주어야 함

            for (int j = 0; j<size; j++) {
                BigInteger num = new BigInteger(br.readLine());
                bi = bi.add(num);
            }

            //compareTo(0)이 -1이면 음수, 1이면 양수, 0이면 0
            if(bi.compareTo(BigInteger.ZERO) == -1) {
                System.out.println("-");
            }else if(bi.compareTo(BigInteger.ZERO) == 1) {
                System.out.println("+");
            }else {
                System.out.println(0);
            }

        }

    }

}

