package main.java.java07_250423wed.basic.ch12.sec08;

import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "년 " + month + "월 " + day + "일");

        int week = now.get(Calendar.DAY_OF_WEEK);
        int time = now.get(Calendar.AM_PM);

        String weeks = null;
        switch (week) {
            case 1 :
                weeks = "일요일";
                break;
            case 2 :
                weeks = "월요일";
                break;
            case 3 :
                weeks = "화요일";
                break;
            case 4 :
                weeks = "수요일";
                break;
            case 5 :
                weeks = "목요일";
                break;
            case 6 :
                weeks = "금요일";
                break;
            case 7 :
                weeks = "토요일";
                break;
        }

        String times = null;
        if (time == 0) {
            times = "오전";
        } else if (time == 1) {
            times = "오후";
        }

        System.out.println(weeks + " " + times);

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second =  now.get(Calendar.SECOND);

        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}
