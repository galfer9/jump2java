package ch03;

public class Ch03_불린 {
    public static void main(String[] args) {
        //불(boolean) : 참 또는 거짓 자료형
        boolean isSuccess = true; //1과 같다.
        boolean isTest = false; //0과 같다.
        //참 또는 거짓을 판단하는 연산
        //조건문에 사용하거나 불타입에 대입
        System.out.println(2 > 1); // true
        System.out.println(2 < 1); //false
        System.out.println(2 == 1); //false
        System.out.println(1 == 1); //true
        System.out.println(3%2 == 1); //true
        //boolean 은 조건문에 사용되곤 함
        int base = 100;
        int h = 185;
        boolean isTall = h >base; //base보다 h가 크면 참
        //if 문에는 조건이 참일때만 명령문을 실행
        if (isTall) {
            System.out.println("키가 큽니다");
        }
    }
}
