package main.java.java11_250507wed.collection.basic.ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Stack 컬렉션 생성
        Stack<Coin> coinBox = new Stack<Coin>(); // Coin 클래스를 타입으로 지정

        // 동전 추가하기
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        // 스택에서 하나씩 뽑기
        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop(); // 꺼낸 코인을 print 하기 위해서 값을 넣을 타입으로 지정해놓기. coin 변수에 저장
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원"); // get을 해놔서 사용해서 넣어놓은 값을 가져오기
        }
    }
}
