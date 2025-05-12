package main.java.java13_250510sat.basic.ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("/Users/minnie/Temp/test1.db"); // 출력 스트림을 사용해서 해당 경로에 test1.db라는 이름으로 출력한다. -> 재출력시 덮어쓰기 되는 듯

            byte a = 10;
            byte b = 20;
            byte c = 30;

            // 1byte를 출력 = 하나씩 출력하기
            os.write(a);
            os.write(b);
            os.write(c);

            os.flush(); //출력 버퍼에 있는 모든 바이트를 (write 한 것) 출력
            os.close(); // 출력 스트림을 닫고, 사용 메모리 해제
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
