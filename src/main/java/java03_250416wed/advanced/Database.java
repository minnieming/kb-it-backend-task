package main.java.java03_250416wed.advanced;

import javax.xml.crypto.Data;

public class Database { // 여기가 private이 아닌 이유는, private이면 다른곳에서 아예 인식 할 수 없기 때문에

    // 1. 클래스는 '설계도'이고 실제로 사용하려면 객체(instance)가 필요하다
    private static Database database = new Database(); // 사용할 객체를 선언해놓기

    // 2. 생성자를 private으로 만들어 외부에서 new를 하지 못하게 함
    private Database(){}

    // 3. 객체를 외부에서 사용하기 위해 get메서드를 만들어준다.
    public static Database getInstance(){ // 싱글톤의 객체를 밖에서 사용가능하게 return 한다. (반환값이 Database)
        return database;
    }
    private String connection = "MySQL";
    public String connect() {
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }
    public void close() {
        System.out.println(connection + "을 닫습니다.");
    }
}
