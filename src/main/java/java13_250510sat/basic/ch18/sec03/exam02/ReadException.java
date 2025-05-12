package main.java.java13_250510sat.basic.ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadException {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("/Users/minnie/Temp/test2.db");

            byte[] data = new byte[100]; // 몇 byte로 가져올지 미리 저장공간을 만드는 것

            while(true) {
                int num = is.read(data); // is를 data로(최대 100byte씩) 읽어온것을 int num으로 리턴하기
                if (num == -1) break; // 더 이상 반환할것이 없으면 -1을 반환한다. (파일의 끝)

                for(int i=0; i<num; i++) { // for문을 사용해서 print 하는 이유는, num 안에 배열로 들어가 있기 때문에 하나씩 꺼내서 Print해주기 위함이다.
                    System.out.println(data[i]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
