package 연습문제자바시작하기;

import java.util.Scanner;

public class GravityCaculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("대기권높이인1000km상공에서 정지상태의 물체가 자유낙하하는 시간을 몇초로 입력하세요.");
        double time = input.nextInt();
        double time2 = time+1;
        double gravity = -9.81;
        double initialVelocity = 0.0;
        double initialposition = 1000000.0; //대기권 1000km

        double finalPosition =0.5*gravity*time*time+initialposition;
        double finalPosition2 =0.5*gravity*time2*time2+initialposition;

        System.out.printf("%.2f초 후 위치: %.2fm\n",time,finalPosition);
        System.out.printf("%.2f+1초 후 위치: %.2fm\n",time2,finalPosition2);
        System.out.printf("초속 : %.2f\n",finalPosition-finalPosition2  );
    }
}
