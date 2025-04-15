package main.java.java01_250414mon.basic.ch02.sec08;

public class CastingExample {
    public static void main(String[] args) {
        int var1 = 10;
        byte var2 = (byte)var1; // 큰쪽이 작은쪽으로 들어가려고 하니까 잃는 부분이 생긴다 (강제 형변환)
        System.out.println(var2);

        long var3 = 300;
        int var4 = (int)var3;
        System.out.println(var4);

        int var5 = 65;
        char var6 = (char)var5;
        System.out.println(var6);

        double var7 = 3.14;
        int var8 = (int)var7;
        System.out.println(var8);
    }
}
