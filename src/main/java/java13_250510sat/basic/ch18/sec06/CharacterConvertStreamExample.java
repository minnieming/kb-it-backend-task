package main.java.java13_250510sat.basic.ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) throws Exception {
        String str = "문자 변환 스트림을 사용합니다.";

        write(str); // 저장하기
        String data = read();
        System.out.println(data);
    }

    // 문자열을 저장하는 메서드
    public static void write (String str) throws Exception{
        OutputStream os = new FileOutputStream("/Users/minnie/Temp/test.txt");
        Writer writer = new OutputStreamWriter(os, "UTF-8"); // 문자열을 UTF-8 문자셋으로 저장

        writer.write(str); // str을 출력하기
        writer.flush();
        writer.close();
    }

    // 문자열을 읽어오는 메서드
    public static String read() throws Exception {
        InputStream is = new FileInputStream("/Users/minnie/Temp/test.txt");
        Reader reader = new InputStreamReader(is, "UTF-8"); // 문자열을 UTF-8 문자셋으로 불러오기

        char[] data = new char[100]; // 문자열을 배열로 불러오기.
        int num = reader.read(data);
        reader.close();

        // main에서 String str = read() 이렇게 메서드를 불러왔으므로 이런 형태로 보내기
        String str = new String(data, 0, num); // data를 0에서부터 num까지 보내기
        return str;
    }
}
