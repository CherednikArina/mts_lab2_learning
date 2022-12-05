package com.company;

public class Circle extends GeomFigure{

     private double radius;
     private String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(double radius ){
        setRadius(radius);
    }
    public void colorCircle(String color){
        if(color != null){
           System.out.println(color);
        }else{
            System.out.println("Цвет не введён");
        }
    }

    @Override
    double GetPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    double GetArea() {
        return 2*Math.pow(Math.PI,2);
    }
}
