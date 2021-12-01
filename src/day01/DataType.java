package day01;

public class DataType {
    public static void main(String[] args) {

        // 정수 타입
        byte a = 127;       //바이트 수 : 1byte
        short b = 32767;    //바이트 수 : 2byte
        int c = 2147483647;  //바이트 수 : 4byte
        long d = 21474836483423243L; //바이트 수 : 8byte

        // 실수 타입
        float f1 = 1.2345678901234F; // 4byte
        double d1 = 1.2345678901234; //8byte

        System.out.println("f1 = " + f1);
        System.out.println("d1 = " + d1);

        // 논리 타입
        boolean b1 = true;  // 소문자 true, false => 대문자 X
        boolean b2 = false;

        // 문자 타입
        char c1 = 'A';  // 한글자만 저장함
        char c2 = 30005;    // 문자로 저장됨 숫자 아님
        System.out.println("c2 = " + c2);

        // String 타입은 문자열을 저장하며 기본타입이 아닌 참조타입입니다.
        String s1 = "hey! ";
        String s2 = "it is so \"easy\"!!";
        System.out.println(s1 + s2);

    }
}
