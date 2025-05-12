package main.java.java13_250510sat.basic.ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        try {
            Reader reader = null; // 2번 사용해야 하므로 여기서 선언 후 사용

            // 한글자씩 처리
            reader = new FileReader("/Users/minnie/Temp/test.txt"); // test.txt에 있는것을 읽어오기
            while(true) {
                int data = reader.read();
                if (data == -1) break;
                System.out.print((char) data); // Data는 Int타입이므로
            }
            reader.close(); // 입력 스트림 닫고 메모리 해제하기
            System.out.println();

            // 글자배열로 처리
            reader = new FileReader("/Users/minnie/Temp/test.txt");
            char[] data = new char[100]; // 배열로 받아올때는 항상 몇 char로 가져올지 저장공간을 미리 선언해놓는것.

            while(true) {
                int num = reader.read(data); // data만큼 읽기
                if (num == -1) break;

                for (int i=0; i<num; i++) { // num안에 있는걸 하나씩 꺼내서 print하기
                    System.out.println(data[i]);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
