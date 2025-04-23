package main.java.java04_250421mon.advanced.ch07.exam;

public class HttpServletExample {
    public static void main(String[] args) {
//        LoginServlet login = new LoginServlet();
//        method(login); // 이걸 한줄로 줄인게 밑에 있는거다.

        method(new LoginServlet()); // 메서드 선언하기. 객체를 만들고, 그걸 바로 메서드에 전달한다.
        method(new FileDownloadServlet()); // 부모타입이 되어 있지만, 실제 객체는 FileDownloadServlet()로 인식해서 이 안에 있는 service()를 실행한다.
    }

    public static void method(HttpServlet httpServlet) { // 부모타입으로 자식 객체를 다룰 수 있다 : 다형성 | 이렇게 하면 어떤 서브 클래스든 넘길 수 있다
        httpServlet.service(); // 컴파일 시점에는 부모타입을 보다가 -> 실행 시점에서 진짜 객체를 확인하고 오버라이딩 된 자식의 메서드를 실행 (동적 바인딩)
    }
}
