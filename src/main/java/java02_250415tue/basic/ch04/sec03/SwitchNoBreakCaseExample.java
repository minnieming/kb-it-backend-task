package main.java.java02_250415tue.basic.ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = 9; // 10, 11 인 경우
        System.out.println("[현재시간: " + time + " 시]"); // [현재시간: 9시]

        switch(time) { // 9
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다."); // 회의를 합니다.
            case 10:
                System.out.println("업무를 봅니다."); // 출력됨
            default:
                System.out.println("외근을 나갑니다."); // 출력됨
        } // switch 문에서 일치하기 때문에 case 9이 출력 돼서 하위의 것들도 다같이 출력이 됐다. (break문의 부재. 다음 케이스로 계속 흘러가면서 실행됨)
    }
}

