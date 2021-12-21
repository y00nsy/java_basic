package com.kh.example.practice1.model.vo;

public class Member {
    String memberId;
    String memberPwd;
    String memberName;
    int age;
    char gender;
    String phone;
    String email;

    public Member(String name, int mAge, String mPhone) {
        memberName = name;
        age = mAge;
        phone = mPhone;
    }

    public void changeName(String name) {
        memberName = name;
    }

    public void printName() {
        System.out.println(memberName);
    }

    // 이름, 나이, 전화번호 출력
    public void information() {
        System.out.printf("이름: %s, 나이: %d세, 전화번호: %s\n", memberName, age, phone);
    }
}
