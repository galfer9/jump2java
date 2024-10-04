package ch04.BAEKJOON연습문제IF;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두개의 수를 입력하세요.");
        int A= sc.nextInt();
        int B = sc.nextInt();

        if (A > B){
            System.out.println(A+">"+B);
        } else if(B > A) {
            System.out.println(A+">"+B);
        } else if (A == B) {
            System.out.println(A+"=="+B);
        }

    }
}
