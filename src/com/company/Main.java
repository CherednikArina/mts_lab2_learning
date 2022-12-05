package com.company;

public class Main {

    public static void main(String[] args) {
	Circle circle = new Circle(1);
	System.out.println(circle.GetPerimeter());
	System.out.println(circle. GetArea());
	circle.colorCircle(null);
	circle.colorCircle("green");

	Square square = new Square(2);
	System.out.println(square.GetPerimeter());
	System.out.println(square.GetArea());

	Point[] points1 = new Point[3];
	points1[0] = new Point(0, 0);
	points1[1] = new Point(1, 0);
	points1[2] = new Point(0, 1);

	Polygon triangle = new Polygon(3, points1);
	System.out.println(triangle.GetPerimeter());
	System.out.println(triangle.GetArea());
	triangle.print();

	Point[] points2 = new Point[4];
        points2[0] = new Point(0, 0);
        points2[1] = new Point(0, 1);
        points2[2] = new Point(1, 1);
        points2[3] = new Point(1, 0);



    Rhombus rhombus = new Rhombus(4, points2);
    System.out.println(rhombus.GetPerimeter());
    System.out.println(rhombus.GetArea());
    }
}

 abstract class GeomFigure{
    abstract double GetPerimeter();
    abstract double GetArea();
 }

interface WithAngles{
    void print();
}

interface Diagonal{
    double GetDiagonals();
}
