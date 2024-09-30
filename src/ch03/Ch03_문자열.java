package ch03;

public class Ch03_문자열 {
    public static void main(String[] args) {
        // 숫자(int,double),문자(char),불린(boolean) => 기초자료형
        // 문자열은 기초(원시)자료형이 아님 문자 몇개쓸지 모르니깐 200바이트도 될 수 있다.
        // String a = "Happy java";
        String a = new String("Happy Java");
        String b = "a"; //""안에는 한개도 문자열이다.
        String c = "123";

        //문자열은 리터럴 표기방식을 사용하는 것이 좋다. new키워드
        //사용하는 방법(객체생성)과 그냥 값을 바로 입력하는 방법이 있는데 바로
        //입력하는 방법이 리터럴 표기방법이다.
        //리터럴 표기 -객체를 생성하지 않고 고정된 값을 그대로 대입

        //내장 매서드
        a = "hello";
        b = "java";
        c = "hello";
        //문자열 비교 매서드 equals (같으면 참)
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        //indexOf : 특정 문자열이 시작되는 위치(인덱스 값)
        a = "Hello Java";
        System.out.println(a.indexOf("Java")); //0부터 시작하니 6
        System.out.println(a.contains("Java"));//해당문자열이 들어있는가

        //charAt : 문자열에서 특정 위치의 문자를 리턴
        System.out.println(a.charAt(6)); //"J"

        //replaceAll : 특정 문자열을 다른 문자열로 바꿀 때
        System.out.println(a.replaceAll("Java","World!"));

        // substracting : 문자열에서 특정 문자열을 뽑아낼 때 사용
        System.out.println(a.substring(0,4));

        //toUpperCase :대문자로 표시
        System.out.println(a.toUpperCase());

        //split :문자열을 특정한 구분자로 나누어 문자열 배열로 리턴
        a = "a:b:c:d";
        String[] result = a.split(":");
        System.out.println(result);

        //문자열 포매팅 (문자열 안에 특정 타입값을 입력) ()안이 먼저 실행됨.
        System.out.println(String.format("나는 사과를 %s개 먹었다!", "5섯"));
        //숫자를 대입
        System.out.println(String.format("나는 사과를 %d개 먹었다.",3));
        System.out.println(String.format("나는 사과를 %d개 먹고 아파서 %s일 후에 약을 먹었다.",3,"삼"));

    }
}
  /*github에 올리기(공유하기)
          줄무늬 버튼 >설정>버전관리>깃허브에 로그인하여 계정 등록
          커밋하고 줄무늬>git>github들어가서 프로젝트 공유하면 올라감.
          그 다음부터 커밋및 푸시 누르면 올라가기까지 다함.


          */
