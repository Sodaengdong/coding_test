package baekjoon;

import java.util.Scanner;

public class Baekjoon_1547 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        int cup = 1;

        for (int i=0; i<num; i++) {
            String change[] = sc.nextLine().split(" ");
            int x = Integer.parseInt(change[0]);
            int y = Integer.parseInt(change[1]);

            if (x == cup) {
                cup = y;
            } else if (y == cup) {
                cup = x;
            }
        }
        System.out.println(cup);
    }
}
