package day17.inter;

                                    //인터페이스는 다중상속이 가능하다
public class BullDog extends Animal implements Pet, Huntable {

    @Override
    public void eat() {
        System.out.println("불독은 잡다한걸 다 먹어요");
    }

    @Override
    public void hunt(String target) {
        System.out.println("불독은 사납게 사냥해요");
    }

    @Override
    public void play() {
        System.out.println("불독은 방방거리면서 놀아요");
    }
}
