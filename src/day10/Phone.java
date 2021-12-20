package day10;

// 설계도 클래스는 main 매서드를 만들지 않음
public class Phone {

    //속성: 객체의 데이터
    //field => 변수아님. 변수는 함수(매서드) 내에 있는 것

    //고유속성
    String model; //모델명
    String color; //색상
    int price; //판매가격

    //상태속성
    int messageCount; //받은 문자메세지 수
    boolean on; //전원이 켜진 여부
    //문자메세지 함
    String[] recieveMessages = new String[3];

    //생성자 : 객체의 초기화를 담당하는 함수
    //기본생성자 -> 매개변수가 없는 생성자, 다른 생성자가 없을 경우
    //             선언하지 않으면 자동으로 선언된다
    Phone() {
        System.out.println("1번 생성자 호출");
        model = "애니콜";
        color = "회색";
        price = 120000;
        powerOn();
    }

    Phone(String pModel) {
        System.out.println("2번 생성자 호출");
        model = pModel;
        color = "스노우 화이트";
        price = 450000;
        powerOn();
    }
    Phone(String pModel, String pColor) {
        System.out.println("3번 생성자 호출");
        model = pModel;
        color = pColor;
        price = 700000;
        powerOn();
    }

    //기능: 객체의 행위
    //기능 = method
    //설계도의 메서드는 static 붙이지 말 것!

    //전원을 켜는 기능
    void powerOn() {
        on = true;
        System.out.println(model + "의 전원을 켭니다.");
    }
    //전원을 끄는 기능
    void powerOff() {
        on = false;
        System.out.println(model + "의 전원을 끕니다.");
    }
    //핸드폰의 정보를 보여주는 기능
    void showSpec() {
        if (!on) {
            System.out.println(model + "의 전원을 먼저 켜주세요.");
            return;
        }

        System.out.println("\n### 휴대폰 정보 ###");
        System.out.println("* 모델명 : " + model);
        System.out.println("* 색상 : " + color);
        System.out.println("* 가격 : " + price + "원");
    }

    //문자메세지를 보내는 기능
    boolean sendMessage(Phone targetPhone, String message) {
        //상대방 메세지함이 가득 차 있는가?
        if (targetPhone.recieveMessages.length > targetPhone.messageCount) { //가득 차지 않았다면
            //메세지를 상대방 메세지함에 저장!
            targetPhone.recieveMessages[targetPhone.messageCount++]
                    = String.format("%s (%s)", message, model);
            return true;
        } else { //가득 찼다면
            System.out.println("상대방의 메세지함이 가득 찼습니다.");
            return false;
        }
    }

    //수신메세지 확인 기능
    void checkMessages() {
        System.out.printf("\n======== [%s]의 메세지함 ========\n", model);
        for (int i = 0; i < messageCount; i++) {
            System.out.printf("# %d. %s\n", i+1, recieveMessages[i]);
        }
    }
}
