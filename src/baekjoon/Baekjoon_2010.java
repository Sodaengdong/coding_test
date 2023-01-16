package baekjoon;

import java.util.Scanner;

public class Baekjoon_2010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int multitap = sc.nextInt();
        int sum = 0;

        for (int i = 0; i<multitap; i++) {

            int num = sc.nextInt();
            sum += num-1;
        }
        sum += 1;

        System.out.println(sum);

    }
}
