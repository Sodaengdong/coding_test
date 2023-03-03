package baekjoon;

import java.util.Scanner;

public class Baekjoon_1292 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int array[] = new int[b];
        int index = 0;
        int sum = 0;

        for (int i = 1; i < b; i++) {
            for (int j = 0; j < i; j++) {
               if (index == b) break;
               array[index++] = i;
            }
        }

        for (int i = a; i <= b; i++) {
            sum += array[i-1];
        }

        System.out.println(sum);
    }
}
