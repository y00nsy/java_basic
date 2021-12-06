package HomeWork;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력해주세요: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print(i % 10);

        }
    }//end main
}
