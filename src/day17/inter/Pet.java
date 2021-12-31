package day17.inter;

public interface Pet {

    //필드는 무조건 public static final로 자동처리 -> 상수처리
    static final String PLAY_GROUND = "애완동물카페";

    //인터페이스 -> 기본적으로 추상메서드를 선언하도록 되어있음
    void play(); //애완동물이 노는 기능

}
