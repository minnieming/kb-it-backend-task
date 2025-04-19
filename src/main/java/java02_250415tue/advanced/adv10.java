package main.java.java02_250415tue.advanced;

public class adv10 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};
        int answer = 0;

        for (int i=1; i<array.length; i++){
            if (array[i-1]>array[i]) {
                answer = array[i-1];
            } else if (array[i-1] < array[i]) {
                answer = array[i];
            }
        }
        System.out.println("배열의 최대값 : " + answer);
    }
}
