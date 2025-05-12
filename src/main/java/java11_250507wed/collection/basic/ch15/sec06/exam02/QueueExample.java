package main.java.java11_250507wed.collection.basic.ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // LinkedList를 큐로 이용
        Queue<Message> messageQueue = new LinkedList<Message>(); // LinkedList는 Deque를 구현하고 있다. Deque는 Queue를 구현하고 있기 때문에 (인터페이스는 상위 인터페이스들도 함께 구현한것으로 간주) 객체를 만들 수 있다.

        // Message 객체(인스턴스)를 큐에 추가하기
        messageQueue.offer(new Message("sendMail", "홍길동")); // .offer() : 주어진 객체를 큐에 넣는다.
        messageQueue.offer(new Message("sendSMS", "신용권"));
        messageQueue.offer(new Message("sendKakaotalk", "김자바"));

        // 큐가 빌때까지 큐에서 Message를 추출하고 -> 출력하기
        while (!messageQueue.isEmpty()) { // 비어있지 않는게 맞다면 -> 계속 반복하기
            Message message = messageQueue.poll(); // .poll() : 큐에서 객체를 빼내는 메서드

            switch (message.command) {
                case "sendMail" :
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case  "sendSMS" :
                    System.out.println(message.to + "님에게 SMS를 보냅니다.");
                    break;
                case  "sendKakaotalk" :
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }

    }
}
