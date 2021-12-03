package day03;

import java.util.Scanner;

public class ScannerQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("**** 상품 재고 총액 구하기 ****");
        System.out.print("- 상품의 가격: ");
        int price = sc.nextInt();

        System.out.print("- 상품의 개수: ");
        int num = sc.nextInt();

        System.out.println("-----------------------------------");
        /// int total = price * num;
        /// System.out.println("- 상품 재고 총액: " + total + "원");
        System.out.printf("- 상품 재고 총액: %d원\n", price * num);

        sc.close();

    }
}
