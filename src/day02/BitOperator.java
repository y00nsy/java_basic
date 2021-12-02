package day02;

public class BitOperator {
    public static void main(String[] args) {

        // 비트 연산자
        byte a = 5; // 이진수로 바꿈 101 => 0000 0101
        byte b = 3; // 11 => 0000 0011

        // & (비트곱) : 각 자리수를 곱하세요
        System.out.println(a & b);  //and //0000 0001 -> 십진수로
        // | (비트합) :  각 자리수를 더하세요. 단, 1 + 1 = 1로 처리하세요
        System.out.println(a | b);  //or // 0000 0111
        // ^ (배타적논리합) : 다르면 1, 같으면 0
        System.out.println(a ^ b);  //xor // 0000 0110

        // 비트 이동 연산
        // 왼쪽방향 이동 : 2의 이동숫자제곱 만큼 곱하기
        // 오른쪽방향 이동 : 2의 이동숫자제곱 만틈 나누기
        int x = 192; // 0000 0000 1100 0000
        System.out.println(x << 3); // 0000 0110 0000 0000 -> 2의 3승을 곱하기
        System.out.println(x >> 2);

        // 비트 반전
        int y = 8;  // 0000 1000
        System.out.println(~y); // 1111 0111
    }
}
