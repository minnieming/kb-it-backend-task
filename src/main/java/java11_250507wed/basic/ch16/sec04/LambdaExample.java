package main.java.java11_250507wed.basic.ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 람다식에 리턴값이 있는 경우
        person.action((x, y) -> {
            double result = x + y;
            return  result;
        });

        // sum() 메서드
        person.action((x,y) -> sum(x,y)); // 아래에 만들어둔 메서드 사용
    }

    public static double sum (double x, double y) {
        return (x + y);
    }
}
