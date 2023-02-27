package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1157 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[26];
        String word = br.readLine();

        for(int i = 0; i < word.length(); i++) {
            if (97 <= word.charAt(i) && word.charAt(i) <= 122) {   //소문자
                arr[word.charAt(i) - 97]++;
            }else {
                arr[word.charAt(i) - 65]++;   //대문자
            }
        }
        int max = -1;
        char index = 0;

        for (int i = 0; i < 26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                index = (char) (i + 65);
            }else if (arr[i] == max) {
                index = '?';
            }
        }
        System.out.println(index);
    }
}
