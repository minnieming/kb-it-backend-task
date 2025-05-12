package main.java.java13_250510sat.basic.ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("/Users/minnie/Temp/test.txt")) {
            char a = 'A';
            char b = 'B';
            writer.write(a);
            writer.write(b);

            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            writer.flush(); // 문자들을 출력하고 버퍼 비우기
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
