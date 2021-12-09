package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stuNum;

        while (true) {
            System.out.print("학생 수를 입력해주세요: ");
            stuNum = sc.nextInt();

            if (stuNum <= 80 && stuNum >=1) {
                break;
            } else {
                System.out.println("1 ~ 80 사이로 입력해주세요");
            }
        }//while

        //입력받은 학생 수만큼의 점수 배열
        int[] stuArr = new int[stuNum];
        // 학생들의 점수 분포수를 저장할 배열
        int[] dist = new int[11];

        System.out.printf("%d명의 점수를 입력해주세요.\n", stuNum);

        for (int i = 0; i < stuArr.length; i++) {
            System.out.printf("%d번 : ", i + 1);
            int s = sc.nextInt();
            if (s < 0 || s > 100) {
                System.out.println("0 ~ 100점 사이로 입력하세요!");
                i--;
                continue;
            }
            stuArr[i] = s;
            dist[s / 10]++;
        } // end for

        System.out.println("\n--- 분포 그래프 ---");

        for (int i = 0; i < dist.length; i++) {

            if(i == dist.length -1){
                System.out.printf("%d : ", i*10);
            } else {
            System.out.printf("%d ~ %d : ", i*10, i*10+9);
            }

            for (int j = 0; j < dist[i]; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }// end for


    } //main
} // class
