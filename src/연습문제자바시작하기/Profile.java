package 연습문제자바시작하기;

public class Profile {
    public static void main(String[] args) {
        //이름 나이 신장 입문자 여부(boolean)을 출력하세요
        String name = "홍팍";
        int age = 35;
        double height = 176.4;
        boolean beginner = true;

        System.out.println("이름: "+name);
        System.out.println("나이: "+age);
        System.out.println("신장: "+height);
        System.out.println("입문자입니까?: "+beginner);
    }
}
