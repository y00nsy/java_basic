package day02;

public class PlusMinusOperator {
    public static void main(String[] args) {

        int x = 10;
        x++;
        ++x;
        x += 1;
        System.out.println("x = " + x);

        int a = 5;
        int b = a++;  //후위 연산 : 다른 연산보다 늦게 적용
        int c = ++b;  //전위 연산 :  다른 연산보다 먼저 적용
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("===================================");

        int n = 5, m = 3;
        int v = n++ * --m;
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        System.out.println("v = " + v);

        int i = 3; // 4 5
        int j = ++i + 5 * 3; //19 18 17
        int k = 5 * j-- + i++ - --j; // 5 * 19-- + 4++ - 17
        System.out.println("i = " + i); // 5
        System.out.println("j = " + j); // 17
        System.out.println("k = " + k); // 82

    }
}
