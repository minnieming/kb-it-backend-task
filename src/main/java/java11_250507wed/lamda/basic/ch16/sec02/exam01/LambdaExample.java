package main.java.java11_250507wed.lamda.basic.ch16.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        // 매개변수가 없는 람다식
                Person person = new Person(); // Person 인스턴스 생성

        // 매개변수 X, 실행문이 두개 이상인 경우
        person.action(() -> {
            System.out.println("출근을 합니다.");
            System.out.println("프로그래밍을 합니다.");
        });

        // 매개변수 X, 실행문이 한개인 경우
        person.action(()-> System.out.println("퇴근합니다."));
    }
}
