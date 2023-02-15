package baekjoon;

import java.util.Scanner;

public class Baekjoon_2231 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = 0;

        for (int i = 1; i < n; i++) {
            int num = sum(i);
            if (num == n) {
                s = i;
                break;
            }
        }
        System.out.println(s);
    }

    //분해합
    static int sum(int n) {
        int ret = n;
        while (n != 0) {
            ret += n % 10;
            n /= 10;
        }
        return ret;
    }

}