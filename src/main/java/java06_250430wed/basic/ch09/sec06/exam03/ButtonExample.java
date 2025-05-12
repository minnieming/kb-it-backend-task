package main.java.java06_250430wed.basic.ch09.sec06.exam03;

import main.java.java06_250430wed.basic.ch09.sec06.exam01.Button;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        }
    }
}
