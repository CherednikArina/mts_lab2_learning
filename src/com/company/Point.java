package com.company;

public class Point {
    int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y){
        setX(x);
        setY(y);
    }
}
