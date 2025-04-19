package main.java.java03_250416wed.basic.ch06.sec08.exam02;

public class Computer {

    int sum (int ...nums) {

        int result = 0;

        for (int i = 0; i <nums.length; i++) {
            result += nums[i];
        }

        return  result;
    }
}
