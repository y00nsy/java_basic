package HomeWork;

import java.util.Scanner;

public class Homework01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("양의 정수를 입력하세요 : ");
        int n = sc.nextInt();
        sc.close();

        if (n >= 0) {
            System.out.printf("%d를 거꾸로 읽으면 ", n);
            for (int i = n; i > 0; i /= 10) {
                System.out.printf("%d", i % 10);
            }
            System.out.printf("입니다.\n");
        } else {
            System.out.println("양의 정수만 입력해주세요.");
        }
    }
}

            /*
            if (num <= 0) {
                System.out.println("♬ 양의 정수만 입력해주세요.");
            } else {
                int rev = num;
                int cnt = 0;
                while (rev != 0) {
                    rev = rev / 10;
                    cnt++;
                }
                int res = 0;
                rev = num;

                for (int i = 0; i < cnt; i++) {
                    res = res * 10 + rev % 10;
                    rev = rev / 10;
                }
                System.out.printf("%d를 거꾸로 읽으면 %d입니다.", num, res);
                break;
                */




