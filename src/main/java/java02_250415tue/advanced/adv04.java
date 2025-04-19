package main.java.java02_250415tue.advanced;

public class adv04 {
    public static void main(String[] args) {
        // x,y는 10이하의 자연수이므로 하나씩 대입했을때 자연수가 나오는 값을 중첩 for문으로 구하기
        for (int x=1; x<=10; x++) {
            for (int y=1; y<10; y++) {
                if ((4*x) + (5*y) == 60) {
                    System.out.println("(" + x + "," + y + ")");
                }
            }
        }
    }
}
