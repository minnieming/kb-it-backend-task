package main.java.java09_250429tue.basic.ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home>{
    @Override // implements 했기 때문에
    public Home rent() {
        return new Home(); // 클래스니까 새로운 객체를 생성해서 보내기
    }
}
