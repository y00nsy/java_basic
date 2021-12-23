package com.kh.hw.member.model.vo;

import com.kh.hw.member.controller.MemberController;

public class Test {
    public static void main(String[] args) {

        MemberController mc = new MemberController();

        mc.insertMember("ddddd","고길동","dd","ddd@ddd.ddd",'M',33);

//        Member member = mc.searchId("bbbbb");
//        System.out.println(member.inform());

//        Member[] members = mc.printAll();
//        for (Member m : members) {
//            if (m == null) break;
//            System.out.println(m.inform());
//        }

//        Member[] members = mc.searchName("박신우");
//        for (Member m : members) {
//            System.out.println(m.inform());
//        }

//        mc.updatePassword("bbbbb", "99999999");
//        Member member1 = mc.searchId("bbbbb");
//        System.out.println(member1.inform());

//        mc.delete("bbbbb");
//        mc.delete("ccccc");
//
//        Member[] members = mc.printAll();
//        for (Member m : members) {
//            if (m == null) break;
//            System.out.println(m.inform());
//        }

        mc.delete();
        Member[] members = mc.printAll();
        System.out.println(mc.existMemberNum());
        for (Member m : members) {
            if (m == null) break;
            System.out.println(m.inform());
        }
    }
}
