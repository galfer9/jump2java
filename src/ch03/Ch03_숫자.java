package ch03;

public class Ch03_숫자 {
    public static void main(String[] args) {
        //정수 타입(자료형)
        int age = 10;
        long count = 2183821823823813112L; //정수는 거의 int인데 숫자가 매우크면 long(끝에 L붙임)쓴다.
        //실수 (더브이 기본)
        float pi = 3.14f; //특별한 경우 아니면  f사용안함. 그냥 double쓰면 됨.
        double pi2 = 3.141592653589793238;
        //8진수와 16진수(8x)
        int oxtal = 023;
        int hex = 0xC3;
        System.out.println(oxtal);
        System.out.println(hex);
        //항상 출력될 때는 10진수로 표현됨.(사람이 10진수로 보니깐)
        // 숫자 연산(+ - * /) :사칙연산

        int a = 10;
        int b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(7 % 3); //나머지 % 기호
        System.out.println(3 % 7);

        //증감연산 (++ --) 1씩 증가, 감소
        int i = 0;
        int j = 10;
        i++; // i=i+1
        j--; // j=j-1
        System.out.println(++i);
        System.out.println(j--);//
        //증감연산자가 앞에 있을 때는 연산이 먼저된다.
        //출력과 증감연산자가 같이 실행되는데 증감연산자가 뒤에 있으면 연산이 나중에 된다.
        System.out.println(i);
        System.out.println(j);//후입연산자의 결과 :8
        int x = i++; //x = 2 , i = 3
        int y = i + --j; // y = 10, i =3, j= 7
        System.out.println(x);
        System.out.println(y);
        System.out.println(i);
        System.out.println(j);

    }
}
