package day01;

public class Casting1 {
    public static void main(String[] args) {
        // 암시적 형변환 (upcating, promotion)
        byte a = 100;  // 1byte

        int b = a;  //4byte
        
        double c= b;  //8byte
        System.out.println("c = " + c);
        
    }
}
