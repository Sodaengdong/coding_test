package baekjoon;

import java.util.Scanner;

public class Baekjoon_2438 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int star_num = sc.nextInt();

        sc.close();

        for (int i = 1; i<=star_num; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
