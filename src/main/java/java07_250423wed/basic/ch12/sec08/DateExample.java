package main.java.java07_250423wed.basic.ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date now = new Date(); // 현재 날짜
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); // 포맷

        String strNow = sdf.format(now); // 현재날짜에 포맷을 맞추기
        System.out.println(strNow);
    }
}
