package main.java.java03_250416wed.advanced.org.scoula.lib;

public class InputTest {
    public static void main(String[] args) {

        String read = Input.read("이름: 이세돌");
        System.out.println("입력값: " + read);

        String read2 = Input.read("이름", "홍길동");
        System.out.println("입력값: " + read2);

        int num = Input.readInt("10");
        System.out.println("입력값: "+num);

        boolean connect = Input.confirm("종료할까요?");
        System.out.println("입력값: " + connect);

        boolean connect2 = Input.confirm("종료할까요?", true);
        System.out.println("입력값: " + connect2);


    }
}
