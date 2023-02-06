package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baekjoon_10824 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input[] = br.readLine().split(" ");

        Long ab = Long.parseLong(input[0]+input[1]);
        Long cd = Long.parseLong(input[2]+input[3]);

        sb.append(ab+cd);


        System.out.println(sb);

    }
}
