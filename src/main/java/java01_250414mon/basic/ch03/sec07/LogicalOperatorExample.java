package main.java.java01_250414mon.basic.ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';
//int charCode = 'a';
//int charCode = '5';
        if( (65<=charCode) & (charCode<=90) ) { // 양쪽 조건을 무조건 모두 검사함. iot 같은 곳에서 주로 쓰인다.
            System.out.println("대문자이군요.");
        }
        if( (97<=charCode) && (charCode<=122) ) { // 왼쪽에서 결과값이 나오면 오른쪽 조건은 검사하지 않음. (단락평가, short-circuit)
            System.out.println("소문자이군요.");
        }
        if( (48<=charCode) && (charCode<=57) ) {
            System.out.println("0~9 숫자이군요.");
        }
//------------------------------------------------------
        int value = 6;
//int value = 7;
        if( (value%2==0) | (value%3==0) ) { // 양쪽 조건을 무조건 모두 검사함
            System.out.println("2 또는 3의 배수이군요.");
        }
        boolean result = (value%2==0) || (value%3==0); // 비교 연산식은 전부 boolean값을 반환하기 때문에 사용할 수 있다.
        if( !result ) { // 이렇게 조건식을 변수로 빼면 읽기도 쉽고, 재사용도 쉬워진다.
            System.out.println("2 또는 3의 배수가 아니군요.");
        }
    }
}
