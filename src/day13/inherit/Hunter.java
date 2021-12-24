package day13.inherit;

public class Hunter extends Player{

    public int arrowCount;

    public Hunter(String name) {
        super(name); //부모의 name,level,hp를 초기화하는 생성자 부름
    }

    // 오버라이딩(부모랑 동일한 시그니처를 가져야함)
    @Override //오버라이딩 룰 검증
    public void info() {
        super.info();
        System.out.println("# 화살: " +arrowCount);
    }

    public void frozenShot() {

    }
}

