package ch03;

public class Ch03_상수집합 {
    enum CoffeeType{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    }
    //enum (상수집합) 왜 필요한가? 예를 들어판매된 커피개수
    //파악하는 프로그램 만들때 일일히 번호 각 커피종류에 매기는 것보다
    //코드가 명확함 1번 아메리카노 보다 대문자로 아예 아메리카노가 명확하지 않냐?
    public static void main(String[] args) {
        System.out.println(CoffeeType.AMERICANO);
        System.out.println(CoffeeType.ICE_AMERICANO);
        System.out.println(CoffeeType.CAFE_LATTE);

        //반복문
        for (CoffeeType CType : CoffeeType.values()) {
            System.out.println(CType);

        }
    }
}
