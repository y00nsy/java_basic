package day17.inter;

public class Tiger extends Animal implements Huntable{

    int grade; //천연기념물 등급

    @Override
    public void hunt(String target) {
        System.out.println("호랑이는 은밀히 사냥한다");
    }

    @Override
    public void eat() {
        System.out.println("호랑이는 고기를 먹어요");
    }
}
