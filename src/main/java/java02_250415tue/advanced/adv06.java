package main.java.java02_250415tue.advanced;

public class adv06 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};
        int max = 0;

        for (int i = 0; i<array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
