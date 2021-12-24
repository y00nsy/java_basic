package day13.protec.pac2;

import day13.protec.pac1.A;

public class D extends A {

    public D() {
//        super(5.5);   => default
        super(100); //protected

        this.f1 = 1;
//        this.f2 = 2;  => default 는 가져올수 없음

        this.m1();
//        this.m2();  => default 는 가져올수 없음

    }
}
