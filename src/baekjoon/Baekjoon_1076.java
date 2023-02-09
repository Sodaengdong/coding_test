package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Baekjoon_1076 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> map = new HashMap<>() {{
            put("black", "0");
            put("brown", "1");
            put("red", "2");
            put("orange", "3");
            put("yellow", "4");
            put("green", "5");
            put("blue", "6");
            put("violet", "7");
            put("grey", "8");
            put("white", "9");
        }};
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

       long ab = Long.parseLong(map.get(a)+map.get(b));
       ab *= Math.pow(10.0,Long.parseLong(map.get(c)));

        System.out.println(ab);
    }
}
