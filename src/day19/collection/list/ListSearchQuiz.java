package day19.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListSearchQuiz {
    public static void main(String[] args) {

        List<String> tvxqList = new ArrayList<>(
                Arrays.asList("영웅재중", "최강창민", "믹키유천", "시아준수", "유노윤호")
        );
        System.out.println("* 변경 전 정보 : " + tvxqList);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("- 수정할 이름을 입력하세요: ");
            System.out.print("> ");
            String targetName = sc.next();

            if (tvxqList.contains(targetName)) {
                System.out.printf("%s의 별명을 변경합니다.\n", targetName);
                System.out.print(">> ");
                String newName = sc.next();

                tvxqList.set(tvxqList.indexOf(targetName), newName);

                System.out.println("변경 완료!");
                System.out.println("* 변경 후 정보 : " + tvxqList);
                break;

            } else {
                System.out.printf("%s은(는) 없는 이름입니다.\n", targetName);
            }


        }//while

    }//main
}//class
