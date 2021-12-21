package day11;

//import day11.fruit.Banana;
//import day11.fruit.Grape;

import day11.fruit.*; // => fruit 패키지 속 클래스 전부 : *

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

       day11.syrub.Apple a1 = new day11.syrub.Apple();
       day11.fruit.Apple a2 = new day11.fruit.Apple();

       Banana b1 = new Banana();
       Grape b2 = new Grape();

       Scanner sc = new Scanner(System.in);
    }
}
