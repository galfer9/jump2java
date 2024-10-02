package 연습문제자바시작하기;

public class BillTest {
    public static void main(String[] args) {
        int price = 152362;
        int omannum = price / 50000;
        int man_ = (price - omannum * 50000);
        int mannum = man_ / 10000;
        int ochonnum_ = (man_ - mannum * 10000);
        int ochonnum = ochonnum_ / 5000;
        int chonnum_ = (ochonnum_ - ochonnum * 5000);
        int chonnum = chonnum_ / 1000;
        int discount = chonnum_% 1000;

        System.out.println("필요한 5만원 : "+omannum+"장");
        System.out.println("필요한 1만원 : "+mannum+"장");
        System.out.println("필요한 5천원 : "+ochonnum+"장");
        System.out.println("필요한 1천원 : "+chonnum+"장");
        System.out.println("실제 금액 : "+(price-discount)+"원");
        System.out.println("할인된 금액 : "+discount+"원");


    }
}
