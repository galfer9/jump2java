package ch02;

/*
 이 프로그램의 저작권은 나에게 있습니다.블록주석
 Copyright 2024
 */

public class Ch02_2_변수와_자료형 {
    public static void main(String[] args) {
        //변수의 선언
        int a; //변수의 선언: 정수형 변수 a를 만듬.
        String b; //문자열 변수 b를 만듬.

        a = 1;
        // = 는 대입 연산자: 값을 입력, 명령문 한줄 쓰면 ;으로 마칠것
        b = "Hello hava";
        // 문자열 쌍따옴표 사용 문자한개는 ''한따옴표
        //변수값을 확인
        char c = 'A'; //동시 선언
        System.out.println(a); //a의 값
        System.out.println(b);
        System.out.println(c);
        //변수는 값을 바꿀 수 있다.
        a = 777777; //만약 a에 아무값도 안넣으면 에러 남.
        b = "hello";
        c = '가';
        System.out.println(a); //a의 값
        System.out.println(b); //b의 값
        System.out.println(c);



    }
}
