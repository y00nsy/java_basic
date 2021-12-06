package day04;

import java.util.Random;
import java.util.Scanner;

public class OperationGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //랜덤 객체 생성
        Random r = new Random();
        //랜덤 정수 생성
        int rn1 = r.nextInt(100);
        int rn2 = r.nextInt(100);

        System.out.println("~~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~~~");
        System.out.println("[ 즐겁게 문제를 푸시다가 지겨우면 0을 누르세요 ]");
        System.out.println("===========================================");


        while (true) {
            int cnt = 1;
            System.out.printf("Q%d. %d + %d = ??\n",cnt, rn1, rn2);
            System.out.print(">> ");
            int answer = sc.nextInt();

            if (rn1 + rn2 == answer) {
                System.out.println("정답입니다!");

            }
            else if (rn1 + rn2 != answer) {
                System.out.println("틀렸습니다!");
            }
            else if (answer == 0) {
                System.out.println("게임을 종료합니다!"); break;
            }


        }
    }
}
