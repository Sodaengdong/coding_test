package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_4470 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] a = new String[num];

        for (int i =0; i<num; i++) {
            a[i] = br.readLine();
        }

        for (int i = 0; i<num; i++) {
            System.out.println((i+1) + ". " + a[i]);
        }
    }
}
