package ch04.BAEKJOON연습문제IF;

import java.util.Scanner;

public class Ex04알람어플개발용 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("시간을 0~24사이로 입력하세요.");
        int H = input.nextInt();
        System.out.println("분을 0~59사이로 입력하세요.");
        int M = input.nextInt();
        if(H >= 0 && H <=23 && M >= 0 && M <=59){
            int time = (H*60 + M)-45;
            int alramhours = time/60;
            int alrammin = time%60;
            System.out.println(alramhours+" : "+alrammin+"분");
        }
    }
}
