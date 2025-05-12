package main.java.java13_250510sat.basic.ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample { // 성능 향상 스트림
    public static void main(String[] args) throws Exception {
        // FileReader에 BufferedREader 보조 스트림 연결
        BufferedReader br = new BufferedReader(new FileReader("main/java/java13_250510sat/basic/ch18/sec07/exam02/ReadLineExample.java"));

        int lineNo = 1; // 처음에 초기화 하기
        while(true) {
            String str = br.readLine(); // 파일에서 한 행씩 읽음
            if(str == null) break;

            System.out.println(lineNo + "\t" + str);
            lineNo++;
        }
        br.close();
    }
}