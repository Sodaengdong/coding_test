package baekjoon;

import java.util.Scanner;

public class Baekjoon_1924 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();
        int sum = d;

        int months[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String days[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        for (int i = 0; i < m-1; ++i) {
            sum += months[i];
        }
        System.out.println(days[sum % 7]);
    }
}
