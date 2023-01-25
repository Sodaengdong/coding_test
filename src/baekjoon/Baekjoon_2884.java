package baekjoon;

import java.util.Scanner;

public class Baekjoon_2884 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = h * 60 + m - 45;

        h = time / 60;
        m = time % 60;

        if(h>=24) {
            h = h - 24;
        }
        if(time<0) {
            h = 23;
            m = 60 + m;

        }
        System.out.print(h + " " + m);

    }
}
