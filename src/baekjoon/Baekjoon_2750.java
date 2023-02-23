package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_2750 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int a[] = new int[num];

        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        for (int i = 0; i < num; i++) {
            System.out.println(a[i]);
        }
    }
}
