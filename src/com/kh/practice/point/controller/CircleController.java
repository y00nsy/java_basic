package com.kh.practice.point.controller;

import com.kh.practice.point.mode.vo.Circle;
import com.kh.practice.point.mode.vo.Point;

public class CircleController extends Point {

    private Circle c = new Circle();

    public String calcArea(int x, int y, int radius) {
        x = getX();
        y = getY();
        radius = c.getRadius();

        double pi = Math.PI;
        int area = (int) (pi * radius * radius);

        return toString();
    }


}
