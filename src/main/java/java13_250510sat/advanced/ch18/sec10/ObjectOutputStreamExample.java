package main.java.java13_250510sat.advanced.ch18.sec10;

import java.io.*;
import java.util.Arrays;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws Exception {
        // 파일 저장
        // 출력 보조 스트림 연결
        FileOutputStream fos = new FileOutputStream("/Users/minnie/Temp/object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 객체 생성
        Member m1 = new Member("fail", "단풍이");
        Product p1 = new Product("노트북", 1500000);
        int[] arr1 = {1,2,3};

        // 객체를 역직렬화해서 파일에 저장
        oos.writeObject(m1);
        oos.writeObject(p1);
        oos.writeObject(arr1);

        oos.flush();
        oos.close();
        fos.close();

        // 역직렬화로 복원
        // 입력 보조 스트림 연결
        FileInputStream fis = new FileInputStream("/Users/minnie/Temp/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Member m2 = (Member) ois.readObject();
        Product p2 = (Product) ois.readObject();
        int[] arr2 = (int[]) ois.readObject();

        ois.close();
        fis.close();

        // 복원된 객체 내용 확인
        System.out.println(m2);
        System.out.println(p2);
        System.out.println(Arrays.toString(arr2));
    }
}
