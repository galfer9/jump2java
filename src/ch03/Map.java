package ch03;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(); //<> 제네릭은  정해지지 않았음 무슨 타입을 넣어도 됨.
        //맵은 추가를 put으로 함
        map.put("people", "사람");
        map.put("baseball", "야구");
        // 자료를 가져올 때 get(키값이 들어감 주의)
        System.out.println(map.get("people"));
        System.out.println(map.get("baseball"));
        System.out.println(map.get("people1")); //없는키이므로 Null 나옴
        // containsKey 맵에 해당 key가 있는지 참 거짓으로 리턴
        System.out.println(map.containsKey("baseball1"));  //false 키값으로 값 들어있는지 없는지 봄.
        //삭제는 remove(키값을 넣는다.) , 리스트 배울땐(인덱스번호 또는 ~~를 넣었었는데)
        System.out.println(map.remove("people")); //매서드 hover하면 리턴값이 삭제된 값임을 알 수 있다.
        System.out.println(map.get("people")); //삭제되었는지 확인
        //size : 갯수
        System.out.println(map.size());
        // keySet 맵의 모든 키를 리턴
        map.put("apple", "사과");
        map.put("orange", "오렌지");
        map.put("orange1", "오렌지1");
        map.put("orange2", "오렌지2");
        System.out.println(map.keySet());
        //맵의 value 값들만 출력
        System.out.println(map.values());
        System.out.println(map.size()); //실행하면 DB가 아니므로 다시 초기화되고 위에서부터 시작됨.




    }
}
