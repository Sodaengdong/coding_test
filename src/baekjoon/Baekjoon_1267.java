package baekjoon;

import java.util.Scanner;

public class Baekjoon_1267 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    int y = 0;
    int m = 0;

    for (int i =0; i<num; i++) {
        int time = sc.nextInt();
        y += (time/30)+1;
        m += (time/60)+1;

    }

    if (10*y<15*m) {
        System.out.println("Y " + 10*y);
    }else if (10*y>15*m) {
        System.out.println("M " + 15*m);
    }else {
        System.out.println("Y M " + 10*y);
    }

    }
}
