package main.java.java13_250510sat.basic.ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        String originalFileName = "/Users/minnie/Temp/test.jpg";
        String targetFileName = "/Users/minnie/Temp/test2.jpg";

        try (
            InputStream is = new FileInputStream(originalFileName); // 복사 할 originalFileName을 불러온다
            OutputStream os = new FileOutputStream(targetFileName); // 보낼 파일의 위치를 넣는다.
        ) {
            byte[] data = new byte[1024]; // 배열 버퍼 생성

            while(true) { //while문 무한 반복하기
                int num = is.read(data); // 최대 1024byte씩 읽기
                if (num == -1) break; // 파일을 다 읽으면 while 문 종료
                os.write(data, 0, num); // data의 0번부터 num까지의 문자를 출력
            }
            os.flush(); // 내부 버퍼 바이트를 출력하고 비우기
            os.close();
            is.close();

            System.out.println("복사가 끝났습니다.");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
