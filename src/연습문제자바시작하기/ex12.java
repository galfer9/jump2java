package 연습문제자바시작하기;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("각자리수를 합할 수를 입력하세요.");
        int num = input.nextInt();
        int sum=0 ;
        while (num > 0 ){
            sum += num%10; //num에서 일의 자리를 sum에 더함.
            int mok = num/10; //일의 자리수를 잘라버리는 식
            num =  mok;  //일의 자리를 자른 수를 다시 대입
        }
        System.out.println(sum);
    }
}
