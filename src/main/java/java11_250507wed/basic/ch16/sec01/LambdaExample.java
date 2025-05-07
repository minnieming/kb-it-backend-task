package main.java.java11_250507wed.basic.ch16.sec01;

public class LambdaExample {
    public static void main(String[] args) {
        // 익명 구현 객체로 했을때
//        action(new Calculable() {
//            @Override
//            public void calculate(int x, int y) {
//                int result = x + y;
//                System.out.println(result);
//            }
//        });

        // (위와 동일한데) 람다식으로 구현.
        // x + y
        action ((x,y) -> {
            int result = x + y;
            System.out.println("result: " + result);
        });

        // x - y
        action ((x,y)-> {
            int result = x - y;
            System.out.println("result: " + result);
        });

    }

    public static void action(Calculable calculable) { // Calculable을 매개변수로 가지고 있는 action() 메서드
        int x = 10;
        int y = 4;

        calculable.calculate(x,y); // Calculable에 있는 추상 메서드에 매개변수를 넣음
    }
}
