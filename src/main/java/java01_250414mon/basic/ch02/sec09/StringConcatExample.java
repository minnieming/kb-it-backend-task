package main.java.java01_250414mon.basic.ch02.sec09;

public class StringConcatExample {
    public static void main(String[] args) {
        int result1 = 10 + 2 + 8;
        System.out.println("result1: " + result1); // 20

        String result2 = 10 + 2 + "8"; // 10+2는 문자를 만나기 전이므로 연산이 가능. 값이 출력됐을때는 String으로 정의 했기에 String이다.
        System.out.println("result2: " + result2); // 128

        String result3 = 10 + "2" + 8;
        System.out.println("result3: " + result3); // 1028

        String result4 = "10" + 2 + 8; // 문자열 + 숫자로 문자열이 된 상태에서 +8이 되었으므로 문자가 되었다. 전체가 결합자가 되었다.
        System.out.println("result4: " + result4); // 1010 X -> 1028

        String result5 = "10" + (2 + 8); // 괄호 안에 있는게 우선적으로 계산이 되므로 연산 가능. 연산자 & 결합자가 다 들어가 있음
        System.out.println("result5: " + result5); //1010
    }
}
