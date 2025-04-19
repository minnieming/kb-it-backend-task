package main.java.java02_250415tue.basic.ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {

        // 배열 선언하기
        int[] arr1;
        int[] arr2;
        int[] arr3;

        // 배열에 값 넣기
        arr1 = new int[] { 1, 2, 3 };
        arr2 = new int[] { 1, 2, 3 };
        arr3 = arr2;

        System.out.println(arr1 == arr2); // false : arr1, arr2는 값은 같지만 new로 초기화 했기 때문에 주소값이 다르다
        System.out.println(arr2 == arr3); // true : arr2는 arr3의 주소값을 복사해서 값이 같다
    }
}
