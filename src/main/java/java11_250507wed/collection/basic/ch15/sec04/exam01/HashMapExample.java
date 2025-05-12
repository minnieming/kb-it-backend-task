package main.java.java11_250507wed.collection.basic.ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        //Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<String, Integer>();

        //객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);

        System.out.println("총 Entry 수: " + map.size()); // .size() : 저장된 키의 총 수를 리턴. entry는 키 + 값이지만, 키의 개수와 동일하기 때문!
        System.out.println();

        //키로 값 얻기
        String key = "홍길동"; // 해당 키의 value 값을 알고 싶다
        int value = map.get(key); // .get(Object key) : 해당 키의 value 값 리턴
        System.out.println(key + ": " + value);
        System.out.println();

        //키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기 -> map에서도 값을 꺼낼 수 있지만, 다양한 방법을 해보기 위한 것!
        Set<String> keySet = map.keySet(); // .keySet() : 모든 키를 Set 객체에 담아서 리턴하는 메서드
        Iterator<String> keyIterator = keySet.iterator(); // keySet 안에 들어있는 값을 하나씩 꺼낼수 있는 반복자 도구 만들기
        while (keyIterator.hasNext()) { // .hasNext() : 가져올 객체가 있으면 true를 리턴, 없으면 false를 리턴
            String k = keyIterator.next(); // keySet(컬렉션)에서 하나의 객체를 가져온다.
            Integer v = map.get(k); // 해당 key 값으로 value 값을 가져오기
            System.out.println(k + " : " + v);
        }
        System.out.println();

        //엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<Entry<String,Integer>> entrySet = map.entrySet(); // .entrySet() 형식 : Map.Entry 객체를 Set에 담아서 리턴
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator(); // entry를 반복하기 위해 반복자 얻기
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey(); // entry.getKey() : 해당 엔트리의 키를 꺼내는 메서드
            Integer v = entry.getValue(); // entry.getValue() : 해당 엔트리의 값을 꺼내는 메서드
            System.out.println(k + " : " + v);
        }
        System.out.println();

//키로 엔트리 삭제
        map.remove("홍길동"); // .remove(키 값) : 주어진 키와 일치하는 Map.Entry 삭제. 삭제가 되면 값을 리턴한다.
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();
    }
}
