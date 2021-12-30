package com.kh.practice3.model.vo;

public class Dog extends Animal{

    public static final String PLACE = "애견카페";
    private int weight;

    public Dog() {
    }

    public Dog(String name, String kinds, int weight) {
        super(name, kinds);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void speak() {
        System.out.printf(super.toString() + " 몸무게는 %dkg 입니다.\n", weight);
    }
}
