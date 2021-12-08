package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {
    public static void main(String[] args) {

        String[] tvxqList = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 변경 전 정보 : " + Arrays.toString(tvxqList));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("- 수정할 이름을 입력하세요: ");
            System.out.print("> ");
            String targetName = sc.next();

            // 탐색 알고리즘
            int index = -1;  //찾은 인덱스를 저장할 변수
            for (int i = 0; i < tvxqList.length; i++) {
                if (targetName.equals(tvxqList[i])){
                    index = i;
                    break;
                }
            }//for

            // 수정여부 판단
            if (index != -1) {
                System.out.printf("%s의 별명을 변경합니다.\n", targetName);
                System.out.print(">> ");
                String newName = sc.next();
                tvxqList[index] = newName;
                System.out.println("변경 완료!");
                System.out.println("* 변경 후 정보 : " + Arrays.toString(tvxqList));
                break;

            } else {
                System.out.printf("%s은(는) 없는 이름입니다.\n", targetName);
            }



            /*
            int result = index;
            if (result >= 0) {
                System.out.printf("\n%s의 별명을 변경합니다.", targetName);
                System.out.print(">> ");
                String newName = sc.nextLine();

                String[] temp = new String[tvxqList.length +1];
                for (int i = 0; i < tvxqList.length; i++) {
                    temp[i] = tvxqList[i];
                }//for
                temp[temp.length -1] = newName;
                tvxqList = temp; temp = null;

                System.out.printf("* 변경 후 정보 : " + Arrays.toString(tvxqList));

            } else {
                System.out.printf("%s은(는) 없는 이름입니다.", targetName);
            } */ //내가 쓴 답








        }//while

    }//main
}//class
