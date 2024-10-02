package 연습문제자바시작하기;

import java.util.Scanner;

public class calculation {
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
        System.out.println("두 수를 입력하세요.");
        int a = cal.nextInt();
        int b = cal.nextInt();

        int c = a*b;
        int d = a/b;
        int e = a%b;

        System.out.printf("곱하기: %d X %d = %d\n",a,b,c);
        System.out.printf("나누기: %d / %d = %d\n",a,b,d);
        System.out.printf("나머지: %d  %d = 나머지는 %d\n",a,b,e);
        //  \n은 줄바꿈이다.

    }
}
