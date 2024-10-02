package 연습문제자바시작하기;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("분과 초로 변환할 초를 입력:");
        int totalSec = input.nextInt();

        int hour = totalSec / 3600;
        int hour_ = totalSec % 3600;
        int min = hour_ / 60;
        int min_ = hour_ % 60;
        int sec = min_ % 60;

        System.out.printf("%d시간 %d분 %d초입니다.", hour, min, sec);



    }
}
