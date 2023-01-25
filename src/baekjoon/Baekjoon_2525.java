package baekjoon;

import java.util.Scanner;

public class Baekjoon_2525 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int make = sc.nextInt();

        int time = h * 60 + m + make;

        h = time/60;
        m = time%60;

        if (h>=24) h = h - 24;

        System.out.println(h + " " + m);

    }
}
