package baekjoon;

import java.util.Scanner;

public class Baekjoon_2530 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        int cs = sc.nextInt();

        s += cs;
        m += s/60;
        s %= 60;
        h += m/60;
        m %= 60;
        h %= 24;

        System.out.println(h + " " + m + " " + s);

    }
}
