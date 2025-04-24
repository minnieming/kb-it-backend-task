package main.java.java07_250423wed.basic.ch12.sec05;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String[] data = data1.split("&|,"); // & 또는 ,로 자르기
        for (String dt : data ) {
            System.out.println(dt);
        }

        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "/"); // data를 / 기준으로 자르기
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
