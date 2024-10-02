package 연습문제자바시작하기;

import java.util.Scanner;

public class InchToCm {
    public static void main(String[] args) {
        double inchToCm = 2.54;
        Scanner inch = new Scanner(System.in);

        System.out.println("허리둘레를 inch로 입력하세요. 센티미터로 바꿔드릴게요 ");
        double cm = inch.nextDouble()*inchToCm;
        System.out.println(cm+"cm입니다.");
    }
}
