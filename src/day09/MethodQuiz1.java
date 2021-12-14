package day09;

import java.util.Arrays;

public class MethodQuiz1 {

    static String[] foods = {"치킨", "파스타", "짬뽕"};

    //foods배열에 새로운 데이터를 끝에 추가하는 함수
    static void push(String newFood) {
        String[] temp = new String[foods.length +1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length -1] = newFood;
        foods = temp;
    }
    // 인덱스 함수
    static int indexOf(String targetFood) {
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if(targetFood.equals(foods[i])) {
                index = i;
                break;
            }
        }//end for
        return index;
    }

    // 삭제 함수
    static void remove(String delName) {
        if (!include(delName)) {
            System.out.println("존재하지 않는 음식명입니다.");
            return;
        }
        // 삭제 대상의 인덱스
        int idx = indexOf(delName);

        for (int i = idx; i < foods.length -1; i++) {
            foods[i] = foods[i+1];
        }
        String[] temp = new String[foods.length -1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = foods[i];
        }
        foods = temp;
    }

    // 음식명 입력 -> 음식이 배열에 저장되었는지 여부 확인
    static boolean include(String targetFood) {
        return indexOf(targetFood) != -1;
    }

    //삽입 함수
    static void insert(int targetIndex, String newData) {

        if (targetIndex < 0 || targetIndex > foods.length -1) {
            System.out.println("인덱스 범위 아님");
            return;
        }

        //1. 사이즈가 하나 더 큰 배열 생성
        String[] temp = new String[foods.length + 1];
        //2. 기존 데이터를 전부 복사
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        //3. 끝데이터부터 뒤로 밀기
        for (int i = temp.length-1; i > targetIndex; i--) {
            temp[i] = temp[i-1];
        }
        //4. 타겟인덱스에 데이터 추가
        temp[targetIndex] = newData;
        //5. 주소 변경
        foods = temp;

    }

    //수정 함수
    static void modify(int targetIndex, String newData) {
        if (targetIndex < 0 || targetIndex > foods.length -1) {
            System.out.println("인덱스 범위 아님");
            return;
        }
        foods[targetIndex] = newData;
    }

    //모든 데이터 삭제
    static void clear() {
        foods = new String[0];
    }




    public static void main(String[] args) {

        push("볶음밥");
        printArray(foods);

        push("라면");
        printArray(foods);

        System.out.println("===================================");

        // 1 리턴
        int idx = indexOf("파스타");
        System.out.println("idx = " + idx);

        // 3리턴
        int idx2 = indexOf("볶음밥");
        System.out.println("idx2 = " + idx2);

        // -1 리턴
        int idx3 = indexOf("망고");
        System.out.println("idx3 = " + idx3);

        System.out.println("===================================");

        remove("볶음밥"); //foods배열에서 볶음밥 제거
        printArray(foods);
        remove("망고"); // 존재하지 않는 음식명입니다. 출력
        printArray(foods);

        insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
        printArray(foods);

        modify(2, "닭갈비"); // 2번 인덱스 데이터 닭갈비로 수정
        printArray(foods);

        clear(); //foods배열 모든 데이터 삭제

        push("탕수육");
        printArray(foods);

        boolean flag = include("파스타"); // 파스타 발견시 true 리턴턴
    }//main

    private static void printArray(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}//class
