package main.java.java02_250415tue.advanced;

public class adv11 {
    public static void main(String[] args) {
        int[][] array = {
            {95,96},
            {83,92,96},
            {78,83,93,87,88}
        };

        int sum = 0;
        int arrays = 0;

        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                sum += array[i][j];
                arrays++;
            }
        }

        System.out.println("전체 합 : " + sum);
        System.out.println("전체 평균 : " + sum/arrays);
    }
}
