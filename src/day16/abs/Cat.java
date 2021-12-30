package day16.abs;

public class Cat extends Pet {
    public Cat(String name, String kind) {
        super(name, kind);
    }

    @Override
    public void takeNap() {
        System.out.println("고양이는 높은곳에서 낮잠을 잔다");
    }

    @Override
    public void eatFood() {
        System.out.println("고양이는 생선사료를 먹는다");
    }


}