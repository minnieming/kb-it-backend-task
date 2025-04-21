package main.java.java03_250416wed.advanced;

import javax.xml.crypto.Data;

public class DatabaseExample {
    public static void main(String[] args) {
        Database db = Database.getInstance(); // new를 사용하지 않고 객체를 불러옴

        String word = db.connect(); // connection의 값을 가져오기 위해 변수를 설정해서 sout을 부르고, 값도 넣음
        System.out.println("데이터베이스: " + word);
        db.close();
    }
}
