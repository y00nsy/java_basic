package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen{

    public V40() {
        setMaker("LG");
    }

    @Override
    public String picture() {
        return null;
    }

    @Override
    public String charge() {
        return null;
    }

    @Override
    public boolean bluetoothPen() {
        return false;
    }

    @Override
    public String makeCall() {
        return null;
    }

    @Override
    public String takeCall() {
        return null;
    }

    @Override
    public String printInformation() {
        return null;
    }

    @Override
    public String touch() {
        return null;
    }
}
