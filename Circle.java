package ru.mirea.lab3;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        radius = 1;
        color = "BLUE";
        filled = false;
    }

    public Circle(double r){
        radius = r;
    }

    public Circle(double r, String c, boolean f){
        radius = r;
        color = c;
        filled = f;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return PI*radius*radius;
    }

    @Override
    public double getPerimeter(){
        return 2*PI*radius;
    }

    @Override
    public String toString(){
        return "This circle has " + radius + " , it's " + color;
    }
}