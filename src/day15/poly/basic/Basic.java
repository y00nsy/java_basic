package day15.poly.basic;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {

    Object x1 = new A();
    Object x2 = new B();
    Object x3 = new C();
    Object x4 = new D();
    Object x5 = new E();

//   C z1 = new D();
//   B z2 = new E();
}
