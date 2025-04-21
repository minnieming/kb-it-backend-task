package main.java.java04_250421mon.basic.ch07.sec07.exam01;
class A { // default로 클래스를 선언. 여기 안에서 사용하려고 이렇게 만들었다.
}
class B extends A {
}
class C extends A {
}
class D extends B {
}
class E extends C {
}
public class PromotionExample {
    public static void main(String[] args) {
        // 선언 - 인스턴스화(메모리에 객체 올라가고, 생성자 호출됨) - 초기화
        // 각 클래스의 객체를 실제로 만들기
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // a - b - d
        // a - c - e
        // 상속의 자동 타입 변환 (그냥 개념만 보면 될 듯!)
        // 이미 만들어진 b,c,d,e 객체를 a타입으로 받아 준 것.
        A a1 = b; // A : int 같이 a1이라는 변수를 만들어서 b라는 값을 넣어주는 것
        A a2 = c; // 여기서 b는 a의 상속을 받았으므로 맞다!
        A a3 = d; // A a3 = new D(); 이거랑 같은거임
        A a4 = e;

        B b1 = d;
        C c1 = e;

//        B b3 = e; // e는 a와 c에 상속을 받았음. b를 상속받지 않음. b와는 형제 관계
//        C c2 = d; // d는 a와 b에 상속을 받았음. c를 상속받지 않음. c와는 형제 관계
    }
}
