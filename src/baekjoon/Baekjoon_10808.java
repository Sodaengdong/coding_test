package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10808 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        int[] num = new int[26];

        for(int i = 0; i<word.length(); i++) {
            num[word.charAt(i)-97]++;
        }
        for (int i =0; i<26; i++) {
            System.out.print(num[i]+ " ");
        }

    }
}
