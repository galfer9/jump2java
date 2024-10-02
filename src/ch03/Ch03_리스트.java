package ch03;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.String.*;
import static java.lang.String.join;

public class Ch03_리스트 {
    public static void main(String[] args) {
        //필요한 자료형 타입은 import 해준다.
        ArrayList pitches = new ArrayList(); //어레이리스트 객체 생성
        //아이템을 추가할때는 add 매서드
        pitches.add("138"); //첫번째 입력 아이템(0)
        pitches.add("129"); //두번째 (1)
        pitches.add("142");//세번째(2)
        //아이템에 접근(가져오기)
        System.out.println(pitches.get(1)); //129
        //사이즈(크기) 몇개냐?(배열은.length)
        System.out.println(pitches.size());
        //contains : 아이템이 있으면 참 없으면 거짓
        System.out.println(pitches.contains("142"));
        //remove : 삭제하기(아이템 ir 인덱스) 두가지 방법
        System.out.println(pitches.remove("129"));
        System.out.println(pitches.remove(0));
        //제네릭 : 자료형을 안전하게 사용할 수 있도록 미리 타입을 정함.
        //정수형 리스트를 만들어보자.
        ArrayList<String> pitches1 = new ArrayList(); //ArrayList pitches1의 자료형으로 문자열만 넣어준다는 뜻임.
        pitches1.add("138");
        pitches1.add("129"); //정수 넣으면 오류남.
        pitches1.add("142");

        ArrayList<Double> numbers = new ArrayList();
        numbers.add(1.1); //에러남. ArrayList 자료형을 Integer에서 Double로 바꿔줄것.
        numbers.add(2.1);
        numbers.add(3.0);
        numbers.add(4.2);
        System.out.println(numbers);

        // 배열을 리스트로 변환하기!
        String[] data = {"월","화","수"};
        //Arrays 의 asList(배열)로 변환 이 매서드 안에 스트링배열 data를 넣어주면 리스트로 바뀌어 리스트 weeks에 추가됨.
        ArrayList<String> weeks = new ArrayList(Arrays.asList(data));
        weeks.add("목");
        weeks.add("금");
        System.out.println(weeks);

        //아이템 직접 입력하기 하나씩 하나씩 집적 입력하는 방법 위에건 이미 있는 배열을 리스트에 넣는 방법
        ArrayList<Integer> n = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(n);

        //아이템들을 문자열로 String.join ,써서 합치기(문자열만 가능) 리스트아이템들을 합쳐서 배열로 만들어줌. 합쳐줄때 적은 ,나:가 들어감
        //외부매서드 불러올 때마다 위에 import로 기능 불러와야 함.
        String result = String.join(":", weeks);
        System.out.println(result);

        //리스트 정렬하기
        n.sort(Comparator.reverseOrder()); //역순 정렬
        System.out.println(n);

        //정방향으로 정렬
        weeks.sort(Comparator.naturalOrder()); //정방향 정렬(오름차순) 한글은 가나다...순.
        System.out.println(weeks);
    }
}
