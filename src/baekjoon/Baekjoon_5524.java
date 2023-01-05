package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_5524 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] word = new String[num];

        for (int i = 0; i<num; i++) {
            word[i] = br.readLine();
        }

        for(int i = 0; i<num; i++) {
            System.out.println(word[i].toLowerCase());
        }

    }
}
