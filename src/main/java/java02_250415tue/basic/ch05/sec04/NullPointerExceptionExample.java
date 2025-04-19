package main.java.java02_250415tue.basic.ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
            int[] intArray = null; // 배열을 만들지 않고, 참조값이 없다고 설정 해놓은 상태. 그냥 선언만 해놓은 상태 | 사용하려면 intArray = new intAttay[3]; 이런식으로 선언해서 사용
            intArray[0] = 10; // 배열이 없는데 인덱스에 값을 넣으려 하니 nullpointerexception이 생긴다.


            String str = null; // Null은 길이가 존재하지 않지만, ""로 한다면 길이가 0으로 잡힌다.
            System.out.println("총 문자 수: " + str.length() ); // str이 null이라 아무것도 들어있지 않은데 length가 있을리가 없다. -> Nullpointerexception 생긴다.
    }
}
