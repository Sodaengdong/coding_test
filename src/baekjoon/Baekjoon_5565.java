package baekjoon;

import java.util.Scanner;

public class Baekjoon_5565 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        int book_sum = 0;

        for (int i = 0; i<9; i++) {

            int price = sc.nextInt();

            book_sum += price;
        }

        System.out.println(sum - book_sum);
    }
}
