package com.company;


public class Polygon extends GeomFigure implements  WithAngles
{
    private int n;
    Point[] points = new Point[n];
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public Polygon(int n, Point[] points){
        setN(n);
        setPoints(points);
    }
    @Override
    double GetPerimeter() {
        double d = 0;
        for (int i = 0; i < n-1; i++) {
             d += Math.sqrt(Math.pow(points[1].getX()-points[1+1].getX(),2)+Math.pow(points[1].getY()-points[1+1].getY(),2));
        }
        //теперь длина между n-ой вершиной и 1-ой
        d += Math.sqrt(Math.pow(points[n-1].getX()-points[0].getX(),2)+Math.pow(points[n-1].getY()-points[0].getY(),2));
        return d;
    }
    //Формула площади Гаусса
    @Override
    double GetArea() {
        double s = 0;
        for (int i = 0; i < n-1; i++) {
            s += points[i].getX()*points[i+1].y;
        }
        s += points[n-1].x*points[0].y;
        for (int i = 0; i < n-1; i++) {
            s -= points[i].y*points[i+1].x;
        }
        s -= points[n-1].x*points[0].y;
        s = 0.5*Math.abs(s);
        return s;
    }

    @Override
    public void print() {
        for (int i = 0; i < n; i++) {
            System.out.printf("Номер вершины: %d  Координата x: %d  Координата y: %d \n", i+1, points[i].x, points[i].y);
        }
    }
}
