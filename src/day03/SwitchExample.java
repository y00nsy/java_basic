package day03;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("### 여행지 추천 프로그램 ###");
        System.out.println("[ 여행을 원하는 계절을 입력하세요 ]");
        System.out.print(">> ");
        String season = sc.next();
        sc.close();

        // switch 안 소괄호에는 문자, 정수형 변수를 쓴다
        switch (season) {
            // case -> switch에 작성한 변수에 저장될 값의 경우를
            //         리터럴이나 상수형태로 작성함 (변수는 사용금지)
            case "봄": case "spring": case "春":
                System.out.println("봄에는 남산타워 가세요");
                break;
            case "여름": case "summer": case "夏":
                System.out.println("여름에는 낙산해수욕장 가세요");
                break;
            case "가을": case "fall": case  "秋":
                System.out.println("가을에는 춘천 가세요");
                break;
            case "겨울": case "winter": case "冬":
                System.out.println("겨울에는 홍천스키장 가세요");
                break;
            default:
                System.out.println("[ 사계절 중 하나의 계절을 정확히 입력하세요 ]");
        } // end switch
    }
}
