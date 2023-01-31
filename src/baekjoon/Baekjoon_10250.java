package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10250 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int h = Integer.parseInt(st.nextToken());
            st.nextToken(); //w값
            int n = Integer.parseInt(st.nextToken());

            if (n%h==0) {
                sb.append((h*100)+(n/h)).append("\n");
            }else {
                sb.append(((n%h)*100)+(n/h+1)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
