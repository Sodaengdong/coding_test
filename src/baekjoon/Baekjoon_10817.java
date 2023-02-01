package baekjoon;

import java.util.Scanner;

public class Baekjoon_10817 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];
        int temp = 0;

        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[1]);
    }
}
