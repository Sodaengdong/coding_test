package baekjoon;

import java.util.Scanner;

public class Baekjoon_1267 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    int sum = 0;

    for (int i =0; i<num; i++) {
        int time = sc.nextInt();
        sum += time;
    }

    int y = sum%30;
    int m = sum%60;

    if (10*y<15*m) {
        System.out.println("Y " + 10*y);
    }else if (10*y>15*m) {
        System.out.println("M " + 15*m);
    }

    }
}
