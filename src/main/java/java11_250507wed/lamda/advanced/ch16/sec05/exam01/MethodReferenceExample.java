package main.java.java11_250507wed.lamda.advanced.ch16.sec05.exam01;

public class MethodReferenceExample {
    public static void main(String[] args) {
        // 메서드 참조
        Person person = new Person();

        // 정적 메서드 : 메모리에 한번 올리고 계속 사용 가능
        // person.action((x,y) -> Computer.staticMethod(x,y));
        person.action(Computer :: staticMethod); // 위의 식과 동일

        // 인스턴스 메서드
        // person.action((x,y) -> com.instanceMethod(x,y));
        Computer com = new Computer();
        person.action(com :: instanceMethod);
    }
}
