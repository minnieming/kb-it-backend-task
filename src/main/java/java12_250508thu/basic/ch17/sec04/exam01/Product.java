package main.java.java12_250508thu.basic.ch17.sec04.exam01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
//@ToString
public class Product {
    private int pno;
    private String name;
    private String company;
    private int price;
}
