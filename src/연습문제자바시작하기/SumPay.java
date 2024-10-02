package 연습문제자바시작하기;

public class SumPay {
    public static void main(String[] args) {
        double mon = 8.62;
        double tue = 10.23;
        double wed = 12.48;
        double thur = 7.82;
        double fri = 9.54;

        double sum;
        sum = mon + tue + wed + thur + fri;
        System.out.printf("월요일부터 금요일까지 얻은 수입의 총합 : %.1f", sum);

    }
}
