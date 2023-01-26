package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_5073 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) break;

            int max = Math.max(a, (Math.max(b, c)));

            if (max == a) {
                if (a >= b + c) {
                    System.out.println("Invalid");
                    continue;
                }
            }

            if (max == b) {
                if (b >= a + c) {
                    System.out.println("Invalid");
                    continue;
                }
            }

            if (max == c) {
                if (c >= a + b) {
                    System.out.println("Invalid");
                    continue;
                }
            }

            if (a == b && a == c && b == c) {
                System.out.println("Equilateral");
            }else if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
            }else if (a != b && b != c && a != c) {
                System.out.println("Scalene");
            }
        }
    }
}
