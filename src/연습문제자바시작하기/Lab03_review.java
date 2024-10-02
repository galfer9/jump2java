package 연습문제자바시작하기;

public class Lab03_review {
    //메인 매소드에 입력하는 배열 args
    public static void main(String[] args) {
//입력 문자열을 실수로 형변환
        double x = 1.23;
        double f = Double.parseDouble(args[0]); //main매소드에 인수 넣는 방법 구성 편집에 직접 넣음. 이건 문자열이니 parse로 변환
        //화씨온도를 섭씨온도로 변환하자.
        double c = (f - 32.0) / 1.8; //네이버 검색 공식 참고
        //printf()매소드를 통한 문자열 출력 실수는 %.1f로 정수는%d 문자한개%c 문자열은 %s로 받음.
        System.out.println(f);
        System.out.printf("화씨 %.1f도 => 섭씨 %.1f도 입니다.", f, c);

        //print : 괄호안 내용을 단순히 출력. 개행문자(=줄바꿈문자=\n) 포함안됨.
        //printf : C에서의 printf와 동일. %d, %s 등을 쓰기위해 사용. 개행문자 포함X
        //println : 괄호안 내용을 출력한 후 마지막에 개행문자가 포함되어 있어 출력후 한 줄 띄워짐.
    }
}
