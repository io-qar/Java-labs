package ru.mirea.lab3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        width = 1;
        length = 2;
        color = "GREEN";
        filled = false;
    }

    public Rectangle(double w, double l){
        width = w;
        length = l;
    }

    public Rectangle(double w, double l, String c, boolean f){
        width = w;
        length = l;
        color = c;
        filled = f;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea(){
        return length*width;
    }

    @Override
    public double getPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString(){
        return "The rectangle has " + width + "width" + " , " + length + "length" + " and " + color + " color";
    }
}
