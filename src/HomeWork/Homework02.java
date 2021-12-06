package HomeWork;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요: ");
        int n = sc.nextInt();
        sc.close();

        int initN = n;
        int digitCount = 0; //자리수를 저장할 변수

        while (n > 0) {
            n /= 10;
            digitCount++;
        }
        System.out.printf("%d은(는) %d자리입니다.", initN, digitCount);

    }
}


/*      Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요: ");
        int num = sc.nextInt();

        int cnt = 0;
        int num1 = num;
        while(num1 != 0) {
            num1 = num1/10;
            cnt++;
        }

        System.out.printf("%d은(는) %d자리입니다.", num, cnt);

        sc.close(); */