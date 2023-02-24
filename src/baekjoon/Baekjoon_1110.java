package baekjoon;

import java.io.*;

public class Baekjoon_1110 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int temp = num;
        int count = 0;

        while (true) {
            int left = num / 10;
            int right = num % 10;
            temp = (right * 10) + ((left + right) % 10);
            count++;

            if (num == temp)  {
                break;
            }
        }
        bw.write(count);
        bw.flush();
    }
}