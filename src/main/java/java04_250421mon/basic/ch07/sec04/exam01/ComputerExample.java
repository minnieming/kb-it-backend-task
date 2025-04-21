package main.java.java04_250421mon.basic.ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Computer computer = new Computer();

        int r = 10;

        // Calculator에서의 areaCircle() 메서드의 계산값
        System.out.println("Calculator에서의 areaCircle() 메서드의 계산값" + calculator.areaCircle(r));

        // Computer에서의 areaCircle() 메서드의 계산값
        System.out.println("Computer에서의 areaCircle() 메서드의 계산값" + computer.areaCircle(r));
    }
}
