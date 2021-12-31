package day17.inter;

public class Main {

    public static void main(String[] args) {

        //인터페이스도 부모클래스로 가능함
        Pet dog = new Dog();
        Huntable tiger = new Tiger();
        Wild shark = new Shark();

    }
}
