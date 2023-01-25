package baekjoon;

import java.util.Scanner;

public class Baekjoon_2562 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max= 0;
        int memory = 0;

        for (int i = 0; i<9; i++) {
            int num = sc.nextInt();
            if(num>max) {
                max = num;
                memory = i;
            }
        }
        System.out.println(max+ "\n" + (memory+1));
    }
}
