package main.java.java13_250510sat.advanced.ch18.sec10;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Member implements Serializable {
    private String id;
    private String name;
}
