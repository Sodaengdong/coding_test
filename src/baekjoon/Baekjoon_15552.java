package baekjoon;

import java.io.*;

public class Baekjoon_15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i<num; i++) {
            String n = br.readLine();
            int a = Integer.parseInt(n.split(" ")[0]);
            int b = Integer.parseInt(n.split(" ")[1]);
            bw.write(a+b+"\n");
        }
        bw.flush();
    }
}
