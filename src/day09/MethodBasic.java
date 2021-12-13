package day09;

/*
    1. 자바의 함수는 class 내부, 함수(main 포함) 외부에 정의한다
    2. 함수의 호출(실행)은 함수(Method 포함) 내부에서만 가능하다
 */

public class MethodBasic {

    // 1 ~ x 까지의 총합을 구하는 함수 정의
    static int calcTotal(int x) {
        System.out.println("함수 호출!");
        int total = 0;
        for (int n = 1; n <= x; n++) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
       int result = calcTotal(10);
       System.out.println("result = " + result);

        int result2 = calcTotal(100);
        System.out.println("result2 = " + result2);

    } //end main Method


}//class
