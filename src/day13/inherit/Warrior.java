package day13.inherit;

public class Warrior extends Player{

    public int rage;

    public Warrior(String name) {
        super(name); //부모의 name,level,hp를 초기화하는 생성자 부름
        System.out.println("Warrior 객체 생성!");
        this.rage = 100;
    }

    // 오버라이딩(부모랑 동일한 시그니처를 가져야함)
    @Override //오버라이딩 룰 검증
    public void info() {
        super.info();
        System.out.println("# 분노: " +rage);
    }

    public void fireRush() { //스킬

    }

}
