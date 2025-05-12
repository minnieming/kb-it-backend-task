package main.java.java06_250430wed.basic.ch09.sec02.exam02;

public class A {
    // 인스턴스 멤버 클래스
    class B {
        int field1 = 1; // 필드
        static int field2 = 2; // 정적 필드

        B() { System.out.println("B-생성자 실행"); } // 생성자

        void method1() { System.out.println("B-method1 실행");} // 인스턴스 메서드
        static void method2() { System.out.println("B-method2 실행");} // 정적 메서드
    }

    void useB() {
        B b = new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }
}
