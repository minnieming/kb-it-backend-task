package main.java.java02_250415tue.basic.ch04.sec03;

public class SwitchCharExample {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A', 'a': // 새로운 버전에는 이렇게 하는 방법도 있다. 오히려 깔끔하고 직관적이고 더 좋음
//            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
        }
    }
}
