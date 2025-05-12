package main.java.java11_250507wed.collection.basic.ch15.sec03.exam02;

public class Member {
    public String name;
    public int age;

    // 기본 생성자가 아닌, 객체를 생성할때 값을 설절 할 수 있게 생성자 만들기
    public Member (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 문제 : 다음 Member 클래스를 Set에 저장하기위한 클래스로 수정하세요.
    // HashSet의 특징은 '동일한 객체(값, 내용. 주소가 아니다)는 중복 저장하지 않는다' 이다.
    // -> 이걸 구현하기 위해 클래스에 hashCode(), equals()를 @Override해서 재정의 해야한다. (문제의 의도)

    @Override
    public int hashCode() { // 객체를 구분하기 위한 숫자코드를 만들어주는 메서드. HashSet은 hashCode()값이 같아야 같은 객체라고 인신한다.
        // 이 메서드에서는 비교할 필드들을 조합해서 고유한 숫자를 생성하는 메서드이다.
        return name.hashCode() + age; // name은 String 타입임으로 hashCode()로 변환해주기. 객체의 메모리 주소를 기반으로 해시값을 생성한다.
    }

    @Override // 매개변수로 받응 객체와 현재 있는 객체의 필드값을 비교하기 위해 사용한다.
    public boolean equals(Object obj) { // == 이거는 주소비교라서 값 비교를 위해 equals 를 사용
        if (obj instanceof Member target) { // obj가 Member의 객체이면 자동으로 Member target = Member) obj 같은 객체를 가리키는 새로운 target이 생겨난 것.
            return target.name.equals(this.name) && (target.age == this.age);
        } else { // obj가 Member 클래스에서 온 객체가 아니라면
            return false;
        }
    }
}
