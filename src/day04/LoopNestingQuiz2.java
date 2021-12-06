package day04;

import java.util.Scanner;

public class LoopNestingQuiz2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("몇 개의 *를 표시할까요? ");
        int star = sc.nextInt();
        System.out.printf("몇 개마다 줄 바꿈 할까요? ");
        int width = sc.nextInt();

        sc.close();

        //줄바꿈 높이
        int height = star / width;

        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf("*");
            }
            System.out.print("\n");
        }
        // 나머지 별들 처리
        int rem = star % width; // 나머지 별 개수
        if (rem > 0) {
            for (int i = 0; i < rem; i++) {
                System.out.printf("*");
            }
        }
    }
}
