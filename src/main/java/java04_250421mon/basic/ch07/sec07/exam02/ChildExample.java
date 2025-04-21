package main.java.java04_250421mon.basic.ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        // 자동 타입 변환 (업캐스팅)
        Parent parent = child;

        parent.method1();
        parent.method2();
//        parent.method3(); // 부모로 형변환이 되었는데, method3();는 자식에 속해있는 메서드이기 때문에 호출하지 못해서 에러가 난다.
    }
}
