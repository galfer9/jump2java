package 연습문제자바시작하기;

import java.util.Scanner;
import static java.lang.Math.round;

public class Currency_Exchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("가지고 있는 유로달러를 입력하세요. : ");
        double eurocurrency = Double.parseDouble(sc.nextLine());

        System.out.println("가지고 있는 미국달러를 입력하세요. : ");
        double Acurrency = Double.parseDouble(sc.nextLine());

        double euro =1281.62664;
        double Ameri = 1091.70306;

        double totalsum = round(eurocurrency*euro + Acurrency*Ameri);
        System.out.println("환전결과 :"+totalsum+"원입니다.");
        System.out.println("유러달러만환전하면 "+round(eurocurrency*euro)+"원입니다.");




    }
}
