package day01;

public class Variable {
    public static void main(String[] args) {

        // 변수의 선언 = 변수를 만드는 과정
        int score;
        // 변수의 초기화 = 값을 저장하는 행위
        score = 86;

        System.out.println(score);

        // 변수의 선언과 초기화 한번에 하는것도 가능
        int life = 3;
        life = 7;       //값을 변경할땐 int 생략
        System.out.println(life);

        int triple = score * 3;
        System.out.println("triple = " + triple);

        // 정수 - int, 실수 - double, 문자열 - String
        // 대소문자 구분할것, 쌍따옴표 사용할것
        String nickName = "짹짹이";
        System.out.println("nickName = " + nickName);

        // nickName = 100;    => 타입에 맞지 않는 값은 저장 불가

        // double score;    => 같은 범위 안에서 같은 이름의 변수 사용 불가능

    }
}
