package day04;

import java.util.Random;
import java.util.Scanner;

public class OperationGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //랜덤 객체 생성
        Random r = new Random();

        System.out.println("~~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~~~");
        System.out.println("[ 즐겁게 문제를 푸시다가 지겨우면 0을 누르세요 ]");
        System.out.println("===========================================");

        System.out.println(" ENTER 를 누르면 시작합니다. ");
        System.out.println("===========================================");
        sc.nextLine();

        int qNum = 1;
        int correct = 0, wrong = 0; // 정답, 오답 횟수
        int max = 20; // 문제 출제 난이도 관련 변수 -> 출제 최대값

        System.out.println("\n 난이도를 입력하세요. ");
        System.out.println("[ 1. 상 (1~100) | 2. 중 (1~50) | 3. 하 (1~20) ]");
        System.out.print(">> ");

        int level = sc.nextInt();
        if (level == 1) {
            max = 100;
        } else if (level == 2) {
            max = 50;
        } else if (level == 3) {
            max = 20;
        } else {
            max = 999;
        }

        while (true) {
            //랜덤 정수 생성
            int rn1 = r.nextInt(max) + 1;
            int rn2 = r.nextInt(max) + 1;

            int markNum = r.nextInt(3); //랜덤 부호 부르는 변수

            int realAnswer = rn1 + rn2; // 실제 정답

            String mark = null; // 랜덤 부호를 저장할 변수 -> 변수 초기화를 해줘야함
            switch (markNum) {
                case 0:
                    mark = "+";
                    realAnswer = rn1 + rn2;
                    break;
                case  1:
                    mark = "-";
                    if (rn1 < rn2) {
                        int temp = rn1;
                        rn1 = rn2;
                        rn2 = temp;
                    } // 문제가 2-9=??로 나올때 9-2=??로 바꿔주기위함
                    realAnswer = rn1 - rn2;
                    break;
                case 2:
                    mark = "x";
                    realAnswer = rn1 * rn2;
                    break;
            }

            System.out.printf("Q%d. %d %s %d = ??\n",qNum++, rn1, mark, rn2);
            System.out.print(">> ");
            int userAnswer = sc.nextInt(); // 사용자의 입력 답

            //종료조건
            if (markNum != 1 && userAnswer == 0) {
                System.out.println("게임을 종료합니다!");
                break;
            }
            //정답검증
            if (userAnswer == realAnswer) {
                System.out.println("정답입니다!");
                correct++;
            } else {
                System.out.println("오답입니다!");
                wrong++;
            }

        }//while
        // 게임 종료 시점
        System.out.println("===========================================");
        System.out.printf("정답 횟수: %d회, 틀린 횟수: %d회\n", correct, wrong);


        sc.close();
    } //main
}//class
