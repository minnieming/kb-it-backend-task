package main.java.java01_250414mon.basic.ch03.sec06;

public class CompareOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2); // true
        boolean result2 = (num1 != num2); // false
        boolean result3 = (num1 <= num2); // true
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2); // 65 < 66 // true
        System.out.println("result4: " + result4);

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4); // true
        System.out.println("result5: " + result5);

        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6); // true X -> false 정밀도의 차이. float는 7자리 정확도, double은 15~17자리 정확도이기 때문에 실제로는 약간 다른 숫자이다.
        boolean result7 = (num5 == (float)num6); // true
        System.out.println("result6: " + result6);
        System.out.println("result7: " + result7);

        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = (str1.equals(str2)); // false
        boolean result9 = (! str1.equals(str2)); // true
        System.out.println("result8: " + result8);
        System.out.println("result9: " + result9);
    }
}
