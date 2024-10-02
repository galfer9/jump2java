package 연습문제자바시작하기;

public class SpeedConversion {
    public static void main(String[] args) {
        double meter = 100;
        double sec =18.0;
        double sisok=0;
        System.out.println(sisok);
        double chosok = meter/sec;
        sisok = chosok*3600/1000;
        System.out.println(chosok);
        System.out.printf("시속 %.2f km per hour입니다.",sisok);
    }
}
