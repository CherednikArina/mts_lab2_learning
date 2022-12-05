package com.company;

public class Rhombus extends Polygon implements Diagonal
{


    public Rhombus(int n, Point[] points) {
        super(n, points);
    }

    @Override
    public double GetDiagonals() {
        return 0;
    }
}
