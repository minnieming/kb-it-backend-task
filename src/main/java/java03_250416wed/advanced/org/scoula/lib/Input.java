package main.java.java03_250416wed.advanced.org.scoula.lib;
import java.util.Scanner;
public class Input {
    static Scanner scanner = new Scanner(System.in);

    static String read (String title) {
        System.out.print(title);
        return scanner.nextLine(); // 사용자가 입력한 문자열 리턴
    }

    static String read (String title, String defaultValue) {
        System.out.print(title+"("+defaultValue+"):");

        String input = scanner.nextLine(); // 사용자가 문자열을 입력하게 한다.

        if (input.isEmpty()) { // 엔터를 쳤을때 = 비어 있을때
            return defaultValue;
        }
        return input; // 사용자가 입력한 문자열 반환
    }

    static int readInt (String title) {
        System.out.print("나이: " + title);
        String input = scanner.nextLine(); // 사용자가 입력한 문자열
        return Integer.parseInt(input); // 문자열을 정수로 변환 후 리턴
    }

    static boolean confirm (String title, boolean defaultValue) {

        String result = defaultValue ? "Y/n" : "y/N";
        System.out.println(title + " ("+result + ")");

        String input = scanner.nextLine();
        if (input.isEmpty()) {
            return defaultValue;
        }

        return input.equalsIgnoreCase("y"); // equalsIgnoreCase를 쓴 이유는 값이 y,Y 둘 다 가능하게 하기 위해서
        // 그리고 값을 이렇게 쓴 이유는 y만 true로 보고 나머지는 false로 보는 경우라서 이렇게 작성
    }

    static boolean confirm (String title){
        return confirm(title, true); // 기본값을 true로 지정한 것 뿐.
    }
}
