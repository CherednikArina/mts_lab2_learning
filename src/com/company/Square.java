package com.company;

public class Square extends GeomFigure{
    int a;
    public Square(int a){
        this.a = a;
    }

    @Override
    double GetPerimeter() {
        return 4*a;
    }

    @Override
    double GetArea() {
        return a*a;
    }

    public void colorSquare(String color) {
        if (color != null) {
            System.out.println(color);
        } else {
            System.out.println("Цвет не введён");
        }
    }
}
