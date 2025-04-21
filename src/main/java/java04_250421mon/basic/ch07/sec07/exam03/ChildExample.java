package main.java.java04_250421mon.basic.ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child(); // 자식에서 부모로 자동 형변환
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

//        parent.field2 = "data2"; // filed2는 자식에 있는 필드이므로 쓸 수 없다.
//        parent.method3(); // method3()는 자식에 있는 메서드이므로 쓸 수 없다.

        Child child = (Child) parent; // 부모에서 자식으로 강제 형변환
        child.field2 = "data2";
        child.method3();
    }
}
