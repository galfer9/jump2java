package ch04.BAEKJOON연습문제while;


import java.util.Scanner;

public class Costco_receipt {
    public static void main(String[] args) {
        int X = 260000;
        int N = 4;
        int[] amount = new int[N];
        int[] su = new int[N];
        int total =0;
        int totalsum = 0;

        Scanner input = new Scanner(System.in);
        for(int i=0;i< N;i++) {
            System.out.println("각 상품마다의 개수를 순서에 맞게 입력하세요.");
            su[i] = input.nextInt();
        }
        for(int i=0;i< N ;i++) {
            System.out.println("각 상품마다의 가격을 순서에 맞게 입력하세요.");
            amount[i] = input.nextInt();
        }



       for(int i=0; i<=(N-1); i++){    //배열은 0부터 시작하니 4종류면 -1해줘야 함.
           total = amount[i]*su[i];
           totalsum += total;
       }
       if(totalsum==X) {
           System.out.println("영수증 총합과 일치합니다.");
       } else {
           System.out.println("영수증 총합과 맞지 않아요. 고객센터에 연락하세요.");
       }
    }
}
