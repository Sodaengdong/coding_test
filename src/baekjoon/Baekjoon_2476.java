package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2476 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int sum = 0; //현재상금
        int max = 0; //가장많은 상금

        for (int i = 0; i<num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == b && a == c) {
                sum = 10000 + (a * 1000);
            } else if (a == b) {
                sum = 1000 + (a * 100);
            } else if (b == c) {
                sum = 1000 + (b * 100);
            } else if (a==c) {
                sum = 1000 + (c * 100);
            } else {
                sum = Math.max(a, Math.max(b, c))*100;
            }
            if (sum>max) max = sum;
        }
        System.out.println(max);
    }
}
