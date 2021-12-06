package HomeWork;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 *를 출력할까요? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0){
                System.out.println();
            }
            System.out.print("*");

        }
    }
}
