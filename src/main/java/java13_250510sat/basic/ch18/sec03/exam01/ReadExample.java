package main.java.java13_250510sat.basic.ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try{
            InputStream is = new FileInputStream("/Users/minnie/Temp/test1.db"); // 입력 스트림

            // 파일에 있는 내용 읽어오기
            while(true) { // 조건 == true는 무한루프를 의미. 안에 break가 있으니 이렇게 사용
                int date = is.read(); // 1byte씩 읽은 후 읽은 바이트를 리턴하기
                if (date == -1) break; // 입력 스트림으로부터 바이트를 읽을 수 없다면 read() 메소드는 -1을 리턴한다. -> 결과값이 하나이기 때문에 {} 없이 바로 break 사용.
                System.out.println(date);
            }

            is.close(); // 입력 스트림 닫고 사용 메모리 해제

        } catch (FileNotFoundException e) { // 파일 자체가 존재하지 않을 경우 발행
            e.printStackTrace();
        } catch (IOException e) { // read, close 메서드에서 IOException이 발생 할 수 있으므로 예외처리
            e.printStackTrace();
        }
    }
}
