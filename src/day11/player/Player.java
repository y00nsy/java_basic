package day11.player;

public class Player {

    public String name; //닉네임
    public int level; //레벨
    public int hp; //체력


    //생성자
    public Player() { //this() : 나의 또다른 생성자에 접근함, 제일 첫줄에 써줘야함
        this("이름없음", 1); //3번생성자로 전달, 연계적 호출
        System.out.println("1번 생성자");
    }

    public Player(String name) {
        this(name, 1);
        System.out.println("2번 생성자");
    }

    public Player(String name, int level) {
        System.out.println("3번 생성자");
        this.name = name;
        this.level = level;
        this.hp = 50;
    }

    //메서드
    public void attack(Player target) { //this(=나,때린애)라는 매개변수는 자동으로 전달받음, 숨겨져있음, 생략가능
        System.out.println("this = " + this);
        System.out.println("target = " + target);

        System.out.printf("%s님이 %s님을 공격합니다.\n", this.name ,target.name);
        target.hp -= 10; //한대맞을떄마다 10체력 소진
        this.hp -= 5; //때릴때마다 5체력 소진
    }
}
