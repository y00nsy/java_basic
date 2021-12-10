package day08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("게임 인원 (2 ~ 4명) ==> ");
        int playerNum = sc.nextInt();

        // 인원 수 검증
        if (playerNum <2 || playerNum >4) {
            System.out.println("인원 수가 올바르지 않습니다. GAME OVER!");
            return;
        }

        // 참여인원수대로 이름을 반복 입력 받기 -> 배열에 저장
        String[] players = new String[playerNum];
        System.out.println("\n플레이어 이름을 등록합니다.");
        for (int i = 0; i < playerNum; i++) {
            System.out.printf("%d번 플레이어 이름 : ", i+1);
            players[i] = sc.next();
        }

        //참여 인원 이름 출력
        System.out.println(Arrays.toString(players) + "  참가!  ");

        System.out.printf("\n실탄 개수 (1 ~ 5개) ==> ");
        int bulletNum = sc.nextInt(); // 총알 갯수

        //총에 실탄 수만큼 총알을 배치해야함 (공간 6개)
        boolean[] magazine = new boolean[6]; //boolean의 기본값 = false

        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");

        Random r = new Random();



        // ======== 핵심 게임 로직 ======== //
        // 선 턴플레이어 결정 -> 무작위
        // 랜덤 인덱스 => 플레이어수 범위 안에서 결정
        int turn = r.nextInt(playerNum);
        System.out.printf("\n총을 돌렸습니다. [%s]부터 시작합니다.\n", players[turn]);

        while (true) {
            /*
            # 1턴 동안 해야할 일
            1. 탄창을 회전 -> 무작위로 격발구의 위치를 결정
                : 랜덤 인덱스(탄창범위 0~5) 생성
            2. 격발 -> 위에서 나온 인덱스로 탄창을 조회하여 실탄이 있는지 확인
            3. 사망 판정 -> 해당 위치에 실탄이 있었다면 (= 값이 true였다면)
                           사망 처리 후 게임 종료, 없었다면 다음 턴으로 이동(nextLine)
            4. 턴 조정 -> 선 턴플레이어만 무작위 , 그 후에 순차적으로 격발
                         지금 격발한 플레이어가 마지막 인덱스 플레이어면
                         다음 턴은 0번으로 조정, 아니면 ++로 처리

             */

            int success = 0; //정확하게 총알을 장전한 횟수 저장
            int position;
            while (true) {
                // 입력 된 실탄 수만틈 탄창 배열의 내부값을 랜덤하게 true로 바꿔야함
                position = r.nextInt(magazine.length); // 탄창의 위치 -> 무작위
                if (!magazine[position]) { // 탄창 안에 실탄이 안들어간 곳에만
                    magazine[position] = true; // 총알을 넣어라
                    success++;
                }
                if (success == bulletNum) break; //총알 장전 횟수랑 총알 갯수가 같아지면 break
            }//while

            System.out.printf("\n[%s의 턴!]       탄창을 무작위로 돌립니다. \n", players[turn]);
            System.out.println("# Enter를 누르면 격발합니다.");


            int bulletPosition = r.nextInt(magazine.length); // 격발구 위치

            if (bulletPosition != position) { // 격발구 위치와 격발이 같지 않으면
                System.out.println("\n휴...... 살았습니다.");
                sc.nextLine();
                } else {
                System.out.printf("\n빵!!! [%s] 사망 ...\n", players[turn]);
                break;
            }




            }//while








    }//main
}// class
